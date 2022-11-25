public class Main {
    public static void main(String[] args) {
        TankFactory tankFactory = new TankFactory();
        Tank tank = tankFactory.createPart().setProperties(100, 100, 100, 100, 100, Manufacturer.A);
        tank = tankFactory.addAddUpgrade(tank, Manufacturer.B);
        tank = tankFactory.addMultUpgrade(tank, Manufacturer.C);

        EngineFactory engineFactory = new EngineFactory();
        Engine engine = engineFactory.createPart().setProperties(100,100, 100, 100, 100, 100, Manufacturer.A);
        engine = engineFactory.addJumper(engine, Manufacturer.B);
        engine = engineFactory.addPowerer(engine, Manufacturer.C);

        HullFactory hullFactory = new HullFactory();
        Hull hull = hullFactory.createPart().setProperties(100, 10000, 100, 100, 100, Colour.RED, Manufacturer.A);

        HumanSpaceshipBuilder builder = new HumanSpaceshipBuilder();
        builder.setHull(hull).setEngine(engine).setTank(tank);
        try {
            Spaceship spaceship = builder.getSpaceship();
            spaceship.fillTank();

            spaceship.takeOff();
            spaceship.hyperJump(100);
            spaceship.land();

            System.out.println(spaceship);
            System.out.println(spaceship.getEngine().numberOfModules());
            System.out.println(spaceship.getTank().numberOfModules());
            System.out.println(spaceship.getHull().numberOfModules());
        } catch (Exception e) {
            System.out.println("" + e);
        }

    }
}