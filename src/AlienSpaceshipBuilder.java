public class AlienSpaceshipBuilder extends SpaceshipBuilder{
    String report() throws MyExceptions.SpaceshipNotReady {
        validateParts();
        int weight = result.hull.weight + result.engine.getSize() + result.tank.getSize();
        if (result.engine.getPower() < weight) {
            return "Engine power(%d) is less then weight of the spaceship(%d). ".formatted(result.engine.getPower(), weight) +
                    "The spaceship will not be able to take off.";
        }

        return "Properties of the spaceship: " +
                "Weight: " + weight +
                ", Power of the engine: " + result.engine.getPower() +
                ", Maximum velocity: " + result.engine.getVelocity() +
                ", Hyper jump maximum length: " + result.engine.getHyperJumpLength() +
                ", Fuel tank capacity: " + result.tank.getCapacity() +
                ".";
    }

    @Override
    public String toString() {
        return "AlienSpaceshipBuilder{" +
                "result=" + result +
                '}';
    }
}
