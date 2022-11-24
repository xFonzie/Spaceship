public class HumanSpaceshipBuilder extends Spaceship.SpaceshipBuilder {
    int getCurrentPrice() {
        int sum = 0;
        if (result.getEngine() != null)
            sum += result.getEngine().getPrice();
        if (result.getHull() != null)
            sum += result.getHull().getPrice();
        if (result.getTank() != null)
            sum += result.getTank().getPrice();
        return sum;
    }

    @Override
    public String toString() {
        return "HumanSpaceshipBuilder{" +
                "result=" + result +
                '}';
    }
}
