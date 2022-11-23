import java.util.List;

public class EngineFactory extends CompoundFactory {
    public Module createCompound(Engine engine, List<Module> modules) {
        EngineCompound result = engine;
        for (Module module : modules) {
            if (module instanceof EngineCompound) {
                result = result.addModule((EngineCompound) module);
            }
        }
        return result;
    }
}
