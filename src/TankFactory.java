public class TankFactory extends PartsFactory{
    public Module createPart() {
        return new Tank();
    }
}
