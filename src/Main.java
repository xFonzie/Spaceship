import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AlienSpaceshipBuilder s = new AlienSpaceshipBuilder();

        Engine engine = new Engine().setProperties(1, 1, 1, 1, 1, 1);
        Tank tank = new Tank().setProperties(1, 100, 1, 1, 1);
        Hull hull = new Hull().setProperties(1, 1000, 100, 100, 1, Colour.RED);

        ConcreteEngineModule engineModule = new ConcreteEngineModule();
        ConcreteEngineModule2 engineModule2 = new ConcreteEngineModule2();

        ConcreteTankModule tankModule = new ConcreteTankModule();
        ConcreteTankModule2 tankModule2 = new ConcreteTankModule2();

        EngineFactory engineFactory = new EngineFactory();
        TankFactory tankFactory = new TankFactory();

        EngineCompound engineCompound = (EngineCompound) engineFactory.createCompound(engine, Arrays.asList(engineModule, engineModule2));
        TankCompound tankCompound = (TankCompound) tankFactory.createCompound(tank, Arrays.asList(tankModule, tankModule2));

        try {
            Spaceship spaceship = s.setEngine(engineCompound).setTank(tankCompound).setHull(hull).getSpaceship();

            spaceship.fillTank();

            spaceship.takeOff();
            spaceship.hyperJump(5);
            spaceship.hyperJump(5);
            spaceship.land();

            System.out.println(spaceship.tank.getFuelLevel());
        } catch (MyExceptions.SpaceshipNotReady |
                MyExceptions.SpaceshipPartsNotSuitable |
                MyExceptions.HyperJumpError |
                IllegalArgumentException ex) {
            System.out.println(ex);
        }

    }
}
