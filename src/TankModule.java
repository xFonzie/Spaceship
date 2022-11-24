public abstract class TankModule extends Tank implements Module {
    protected Manufacturer manufacturer;
    protected Tank inner;

    public TankModule(Tank inner, Manufacturer manufacturer) {
        this.inner = inner;
        this.manufacturer = manufacturer;
    }

    public int numberOfModules() {
        return 1 + inner.numberOfModules();
    }

    public String getProperties() {
        return this.toString();
    }

    public abstract String toString();
}
