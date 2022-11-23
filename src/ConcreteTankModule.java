public class ConcreteTankModule extends TankCompound implements Module{
    public int getPrice() {
        if (inner == null)
            return 15600;
        return inner.getPrice() + 15600;
    }

    public int getCapacity() {
        if (inner == null)
            return 0;
        return (int) (inner.getCapacity() * 1.5);
    }

    @Override
    boolean isBaseTank() {
        return false;
    }
    public TankCompound copy() {
        return inner.copy().addModule(new ConcreteTankModule());
    }

    public String toString() {
        return "ConcreteTankModule{" +
                "inner=" + inner +
                ", capacity=" + getCapacity() +
                ", price=" + getPrice() +
                '}';
    }
}
