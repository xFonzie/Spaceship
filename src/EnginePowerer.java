public class EnginePowerer extends EngineModule {
    public EnginePowerer(Engine inner, Manufacturer manufacturer) {
        super(inner, manufacturer);
    }

    public int getPrice() {
        int price = 100;

        return inner.getPrice() + price;
    }

    public int getPower() {
        return (int) (inner.getPower() * 1.2);
    }

    @Override
    public EngineModule copy() {
        return new EnginePowerer(inner.copy(), manufacturer);
    }

    @Override
    public String toString() {
        return "EnginePowerer [manufacturer=" + manufacturer + ", inner=" + inner + "]";
    }
}