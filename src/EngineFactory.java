public class EngineFactory extends PartFactory {

    @Override
    public Engine createPart() {
        return new Engine();
    }

    public Engine addJumper(Engine engine, Manufacturer manufacturer) {
        return new EngineJumper(engine, manufacturer);
    }

    public Engine addPowerer(Engine engine, Manufacturer manufacturer) {
        return new EnginePowerer(engine, manufacturer);
    }
}
