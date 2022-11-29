public class TankAddUpgrade extends TankModule{

    public TankAddUpgrade(TankCompound wrappee, Manufacturer manufacturer) {
        super(wrappee, manufacturer);
    }

    public int getCapacity() {
        int capacity = 100;

        return inner.getCapacity() + capacity;
    }

    public int getPrice() {
        int price = 100;

        return inner.getPrice() + price;
    }

    public TankAddUpgrade copy() {
        return new TankAddUpgrade(inner.copy(), manufacturer);
    }

    @Override
    public String toString() {
        return "ConcTankModule2{" +
                "manufacturer=" + manufacturer +
                ", wrappee=" + inner +
                '}';
    }
}
