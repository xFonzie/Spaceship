public class HumanSpaceshipBuilder extends SpaceshipBuilder {
    int getCurrentPrice() {
        int sum = 0;
        if (result.engine != null)
            sum += result.engine.price;
        if (result.body != null)
            sum += result.body.price;
        if (result.tank != null)
            sum += result.tank.price;
        return sum;
    }

    @Override
    public String toString() {
        return "HumanSpaceshipBuilder{" +
                "result=" + result +
                '}';
    }
}
