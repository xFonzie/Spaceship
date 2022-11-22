public class Spaceship{
    Body body;
    Engine engine;
    Tank tank;

    Spaceship() {}

    /** @noinspection IncompleteCopyConstructor*/
    public Spaceship(Spaceship other) {
        this.body = other.body.copy();
        this.engine = other.engine.copy();
        this.tank = other.tank.copy();
    }

    public void hyperJump(int distance) {

    }
}
