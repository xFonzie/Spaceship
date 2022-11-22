public class SpaceshipBuilder implements Builder{
    private Spaceship result;

    public SpaceshipBuilder() {
        result = new Spaceship();
    }

    public void reset() {
        result = new Spaceship();
    }

    public SpaceshipBuilder setBody(Body body) {
        result.body = body;
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

    public Spaceship getSpaceship() throws MyExceptions.SpaceshipNotReady {
        if (result.body == null || result.engine == null || result.tank == null) {
            throw new MyExceptions.SpaceshipNotReady(("Spaceship missing some parts. " +
                    "Please, provide full set of parts. Current setup:" +
                    "Body: %b, Engine: %b, Tank: %b").formatted(result.body, result.engine, result.tank));
        }
        return new Spaceship(result);
    }
}
