public class Spaceship{
    Hull hull;
    EngineCompound engine;
    TankCompound tank;
    boolean isFlying = false;

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
        tank.fillTank();
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
}
