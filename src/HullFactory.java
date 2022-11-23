public class HullFactory extends PartsFactory{
    public Module createPart() {
        return new Hull();
    }
}
