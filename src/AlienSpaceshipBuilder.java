public class AlienSpaceshipBuilder extends Spaceship.SpaceshipBuilder{
    String report() throws MyExceptions.SpaceshipNotReady {
        validateParts();
        int weight = result.getHull().getWeight() + result.getEngine().getSize() + result.getTank().getSize();
        if (result.getEngine().getPower() < weight) {
            return "Engine power(" + result.getEngine().getPower() +
                    ") is less then weight of the spaceship(" + weight +
                    "). The spaceship will not be able to take off.";
        }

        return "Properties of the spaceship: " +
                "Weight: " + weight +
                ", Power of the engine: " + result.getEngine().getPower() +
                ", Maximum velocity: " + result.getEngine().getVelocity() +
                ", Hyper jump maximum length: " + result.getEngine().getHyperJumpLength() +
                ", Fuel tank capacity: " + result.getTank().getCapacity() +
                ".";
    }

    @Override
    public String toString() {
        return "AlienSpaceshipBuilder{" +
                "result=" + result +
                '}';
    }
}
