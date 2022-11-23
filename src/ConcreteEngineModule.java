public class ConcreteEngineModule extends EngineCompound implements Module {
    public int getVelocity() {
        if (inner == null)
            return 0;
        return (int) (inner.getVelocity() * 1.25);
    }

    public int getPrice() {
        int price = 1000;
        if (inner == null)
            return price;
        return inner.getPrice() + price;
    }

    public int getHyperJumpLength() {
        int length = 7;
        if (inner == null)
            return length;
        return inner.getHyperJumpLength() + length;
    }

    public int getPower() {
        int power = 100;
        if (inner == null)
            return power;
        return inner.getPower() + power;
    }

    @Override
    public EngineCompound copy() {
        return inner.copy().addModule(new ConcreteEngineModule());
    }

    @Override
    public String toString() {
        return "EngineModule{" +
                "inner=" + inner +
                ", velocity=" + getVelocity() +
                ", price=" + getPrice() +
                ", hyperJumpLength=" + getHyperJumpLength() +
                ", power=" + getPower() +
                '}';
    }
}
