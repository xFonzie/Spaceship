import java.util.List;

public class TankFactory extends CompoundFactory {
    public Module createCompound(Tank tank, List<Module> modules) {
        TankCompound result = tank;
        for (Module module : modules) {
            if (module instanceof TankCompound) {
                result = result.addModule((TankCompound) module);
            }
        }
        return result;
    }
}
