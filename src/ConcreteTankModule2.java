public class ConcreteTankModule2 extends TankCompound implements Module{

    public int getPrice() {
        int price = 10;
        if (inner == null)
            return price;
        return inner.getPrice() + price;
    }

    @Override
    TankCompound copy() {
        return inner.copy().addModule(new ConcreteTankModule2());
    }

    public int getCapacity() {
        if (inner == null)
            return 0;
        return (int) (inner.getCapacity() * 0.5 + 100);
    }

    @Override
    boolean isBaseTank() {
        return false;
    }
}
