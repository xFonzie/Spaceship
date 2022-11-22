public class Spaceship{
    Body body;
    Engine engine;
    Tank tank;

    Spaceship() {}

    public Spaceship(Spaceship other) {
        this.body = other.body;
        this.engine = other.engine;
        this.tank = other.tank;
    }

    public void hyperJump(int distance) {

    }
}
