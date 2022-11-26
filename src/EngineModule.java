public abstract class EngineModule implements EngineCompound {
    Manufacturer manufacturer;
    Engine inner;

    public EngineModule(Engine inner, Manufacturer manufacturer) {
        this.inner = inner;
        this.manufacturer = manufacturer;
    }

    public int getDurability() {
        return inner.getDurability();
    }

    public int getSize() {
        return inner.getSize();
    }

    public int getVelocity() {
        return inner.getVelocity();
    }

    public int getPrice() {
        return inner.getPrice();
    }

    public int getHyperJumpLength() {
        return inner.getHyperJumpLength();
    }

    public int getPower() {
        return inner.getPower();
    }

    public int numberOfModules() {
        return 1 + inner.numberOfModules();
    }

    public String getProperties() {
        return this.toString();
    }

    public abstract EngineModule copy();

    public abstract String toString();
}
