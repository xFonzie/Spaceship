public abstract class SpaceshipBuilder {
    protected Spaceship result;

    public SpaceshipBuilder() {
        result = new Spaceship();
    }

    public SpaceshipBuilder setHull(Hull hull) {
        result.hull = hull;
        return this;
    }

    public SpaceshipBuilder setEngine(EngineCompound engine) {
        result.engine = engine;
        return this;
    }

    public SpaceshipBuilder setTank(TankCompound tank) {
        result.tank = tank;
        return this;
    }

    public void reset() {
        result = new Spaceship();
    }

    protected void validateSpaceship() throws MyExceptions.SpaceshipNotReady, MyExceptions.SpaceshipPartsNotSuitable {
        validateParts();
        if (result.engine.getSize() > result.hull.engineMaxSize)
            throw new MyExceptions.SpaceshipPartsNotSuitable("The engine is too big.");
        if (result.tank.getSize() > result.hull.tankMaxSize)
            throw new MyExceptions.SpaceshipPartsNotSuitable("The tank is too big.");
        if (result.tank.getSize() + result.engine.getSize() > result.hull.capacity)
            throw new MyExceptions.SpaceshipPartsNotSuitable("The parts are too heavy.");
    }

    protected void validateParts() throws MyExceptions.SpaceshipNotReady {
        if (result.hull == null || result.engine == null || result.tank == null) {
            throw new MyExceptions.SpaceshipNotReady(("Spaceship missing some parts. " +
                    "Please, provide full set of parts. Current setup: " +
                    "Hull: %b, Engine: %b, Tank: %b").formatted(result.hull, result.engine, result.tank));
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
