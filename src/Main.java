public class Main {
    public static void main(String[] args) {
        AlienSpaceshipBuilder s = new AlienSpaceshipBuilder();
        PartsFactory tankFactory = new TankFactory();
        Tank tank = (Tank) tankFactory.createPart();
        tank.setProperties(80, 100, 1200, 100, 4);

        PartsFactory engineFactory = new EngineFactory();
        Engine engine = (Engine) engineFactory.createPart();
        engine.setProperties(100, 1000, 100, 15, 15000, 100);

        PartsFactory hullFactory = new HullFactory();
        Hull hull = (Hull) hullFactory.createPart();
        hull.setProperties(60, 300, 150, 150, 90000, Colour.RED);

        try {
            s.setTank(tank).setEngine(engine).setHull(hull);
            Spaceship spaceship = s.getSpaceship();
            System.out.println(spaceship);
        } catch (MyExceptions.SpaceshipNotReady | MyExceptions.SpaceshipPartsNotSuitable spaceshipNotReady) {
            spaceshipNotReady.printStackTrace();
        }

    }
}
