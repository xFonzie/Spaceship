public class EngineFactory extends PartsFactory{
    public Module createPart() {
        return new Engine();
    }
}
