public class ConcreteEngineModule2 extends EngineCompound implements Module{

    int getVelocity() {
        if (inner == null)
            return 0;
        return (int) (inner.getVelocity() * 1.10 + 100);
    }

    int getPrice() {
        int price = 2000;
        if (inner == null)
            return price;
        return inner.getPrice() + price;
    }

    public EngineCompound copy() {
        return inner.copy().addModule(new ConcreteEngineModule2());
    }

    public String toString() {
        return "ConcreteEngineModule2{" +
                "inner=" + inner +
                ", velocity=" + getVelocity() +
                ", price=" + getPrice() +
                '}';
    }
}
