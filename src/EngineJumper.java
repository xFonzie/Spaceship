public class EngineJumper extends EngineModule{
    public EngineJumper(EngineCompound inner, Manufacturer manufacturer) {
        super(inner, manufacturer);
    }

    public int getPrice() {
        int price = 100;

        return inner.getPrice() + price;
    }

    public int getHyperJumpLength() {
        int hyperJumpLength = 100;

        return inner.getHyperJumpLength() + hyperJumpLength;
    }

    @Override
    public EngineModule copy() {
        return new EngineJumper(inner.copy(), manufacturer);
    }

    @Override
    public String toString() {
        return "EngineJumper [manufacturer=" + manufacturer + ", inner=" + inner + "]";
    }
}
