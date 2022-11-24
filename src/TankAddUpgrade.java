public class TankAddUpgrade extends TankModule{

    public TankAddUpgrade(Tank wrappee, Manufacturer manufacturer) {
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

    @Override
    public String toString() {
        return "ConcTankModule2{" +
                "manufacturer=" + manufacturer +
                ", wrappee=" + inner +
                '}';
    }
}
