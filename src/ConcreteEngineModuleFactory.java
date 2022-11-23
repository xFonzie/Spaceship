public class ConcreteEngineModuleFactory extends PartsFactory {
    public Module createPart() {
        return new ConcreteEngineModule();
    }
}