public class Spaceship{
    Hull hull;
    Engine engine;
    Tank tank;

    Spaceship() {}

    /** @noinspection IncompleteCopyConstructor*/
    public Spaceship(Spaceship other) {
        this.hull = other.hull.copy();
        this.engine = other.engine.copy();
        this.tank = other.tank.copy();
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
