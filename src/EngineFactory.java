public class EngineFactory extends PartFactory {

    @Override
    public Engine createPart() {
        return new Engine();
    }

    public EngineCompound addJumper(EngineCompound engine, Manufacturer manufacturer) {
        return new EngineJumper(engine, manufacturer);
    }

    public EngineCompound addPowerer(EngineCompound engine, Manufacturer manufacturer) {
        return new EnginePowerer(engine, manufacturer);
    }
}
