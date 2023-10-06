public class Truck extends Vehicle implements Driveable{
    public Truck(String name, int speed, float price, Engine engine) {
        super(name, speed, price, engine);
    }

    @Override
    public void printVehicleType(Vehicle vehicle) {
        System.out.println(vehicle.getName());
    }

    @Override
    public float getPriceAfterTax(Vehicle vehicle) {
        float vehiclePriceAfterTax = getPrice() + (getPrice() * TAX_AMOUNT);
        System.out.println(vehiclePriceAfterTax);
        return vehiclePriceAfterTax;
    }

    @Override
    public void printSpeed() {
        System.out.println(getSpeed());
    }

    @Override
    public String toString() {
        return "Truck{" +
                "speed=" + getSpeed() +
                ", price=" + getPrice() +
                ", TAX_AMOUNT=" + getTAX_AMOUNT() +
                '}';
    }
}
