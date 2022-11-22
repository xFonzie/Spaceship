public class AlienSpaceshipBuilder extends SpaceshipBuilder{
    String report() throws MyExceptions.SpaceshipNotReady {
        validateParts();
        int weight = result.hull.weight + result.engine.size + result.tank.size;
        if (result.engine.power < weight) {
            return "Engine power(%d) is less then weight of the spaceship(%d). ".formatted(result.engine.power, weight) +
                    "The spaceship will not be able to take off.";
        }

        return "Properties of the spaceship: " +
                "Weight: " + weight +
                ", Power of the engine: " + result.engine.power +
                ", Maximum velocity: " + result.engine.maxVelocity +
                ", Hyper jump maximum length: " + result.engine.hyperJumpLength +
                ", Fuel tank capacity: " + result.tank.capacity +
                ".";
    }

    @Override
    public String toString() {
        return "AlienSpaceshipBuilder{" +
                "result=" + result +
                '}';
    }
}
