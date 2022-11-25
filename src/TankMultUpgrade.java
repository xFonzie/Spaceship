public class TankMultUpgrade extends TankModule{

    public TankMultUpgrade(Tank wrappee, Manufacturer manufacturer) {
        super(wrappee, manufacturer);
    }

    public int getPrice() {
        int price = 10;

        return inner.getPrice() + price;
    }

    public int getCapacity() {
        return (int) (inner.getCapacity() * 1.1);
    }

    public TankMultUpgrade copy() {
        return new TankMultUpgrade(inner.copy(), manufacturer);
    }

    @Override
    public String toString() {
        return "ConcTankModule1{" +
                "manufacturer=" + manufacturer +
                ", wrappee=" + inner +
                '}';
    }
}
