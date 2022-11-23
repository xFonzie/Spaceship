public class Spaceship{
    Hull hull;
    EngineCompound engine;
    TankCompound tank;

    public Spaceship copy() {
        Spaceship copy = new Spaceship();
        copy.hull = hull.copy();
        copy.engine = engine.copy();
        copy.tank = tank.copy();
        return copy;
    }

    public void hyperJump(int distance) {

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
