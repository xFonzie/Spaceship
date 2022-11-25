public class Spaceship{
    private Hull hull;
    private Engine engine;
    private Tank tank;
    private boolean isFlying = false;

    public Spaceship copy() {
        Spaceship copy = new Spaceship();
        copy.hull = hull.copy();
        copy.engine = engine.copy();
        copy.tank = tank.copy();
        return copy;
    }

    public int numberOfModules() {
        return engine.numberOfModules() + tank.numberOfModules();
    }

    public Spaceship fillTank() {
        tank.setFuel(tank.getCapacity());
        return this;
    }

    public Spaceship takeOff() {
        if (tank.getFuelLevel() < 1)
            throw new IllegalArgumentException("Not enough fuel");
        isFlying = true;
        tank.useFuel(1);
        return this;
    }

    public Spaceship land() {
        isFlying = false;
        return this;
    }

    public void hyperJump(int distance) throws MyExceptions.HyperJumpError {
        if (!isFlying)
            throw new MyExceptions.HyperJumpError("Spaceship is not flying");
        if (tank.getFuelLevel() < distance)
            throw new IllegalArgumentException("Not enough fuel");
        if (engine.getHyperJumpLength() < distance)
            throw new IllegalArgumentException("Not enough hyper jump length");
        tank.useFuel(distance);
    }

    public Spaceship repaint(Colour colour) {
        hull.setColor(colour);
        return this;
    }

    @Override
    public String toString() {
        return "Spaceship{" +
                "hull=" + hull +
                ", engine=" + engine +
                ", tank=" + tank +
                '}';
    }

    public Hull getHull() {
        return hull;
    }

    protected void setHull(Hull hull) {
        this.hull = hull;
    }

    public Engine getEngine() {
        return engine;
    }

    protected void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tank getTank() {
        return tank;
    }

    protected void setTank(Tank tank) {
        this.tank = tank;
    }

    public boolean isFlying() {
        return isFlying;
    }

    public static abstract class SpaceshipBuilder {
        protected Spaceship result;

        public SpaceshipBuilder() {
            result = new Spaceship();
        }

        public SpaceshipBuilder setHull(Hull hull) {
            result.hull = hull;
            return this;
        }

        public SpaceshipBuilder setEngine(Engine engine) {
            result.engine = engine;
            return this;
        }

        public SpaceshipBuilder setTank(Tank tank) {
            result.tank = tank;
            return this;
        }

        public void reset() {
            result = new Spaceship();
        }

        protected void validateSpaceship() throws MyExceptions.SpaceshipNotReady, MyExceptions.SpaceshipPartsNotSuitable {
            validateParts();
            if (result.engine.getSize() > result.hull.getEngineMaxSize())
                throw new MyExceptions.SpaceshipPartsNotSuitable("The engine is too big.");
            if (result.tank.getSize() > result.hull.getTankMaxSize())
                throw new MyExceptions.SpaceshipPartsNotSuitable("The tank is too big.");
            if (result.hull.getWeight() + result.tank.getSize() + result.engine.getSize() > result.hull.getCapacity())
                throw new MyExceptions.SpaceshipPartsNotSuitable("The parts are too heavy.");
        }

        protected void validateParts() throws MyExceptions.SpaceshipNotReady {
            if (result.hull == null || result.engine == null || result.tank == null) {
                throw new MyExceptions.SpaceshipNotReady("Spaceship missing some parts. " +
                        "Please, provide full set of parts. Current setup: " +
                        "Hull: " + (result.hull != null) +
                        ", Engine: " + (result.engine != null) +
                        ", Tank: " + (result.tank != null));
            }
        }

        public Spaceship getSpaceship() throws MyExceptions.SpaceshipNotReady, MyExceptions.SpaceshipPartsNotSuitable {
            validateSpaceship();
            return result.copy();
        }

        @Override
        public String toString() {
            return "SpaceshipBuilder{" +
                    "result=" + result +
                    '}';
        }
    }

}
