public abstract class EngineModule extends Engine implements Module {
    Manufacturer manufacturer;
    EngineModule inner;

    public EngineModule(EngineModule inner, Manufacturer manufacturer) {
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
