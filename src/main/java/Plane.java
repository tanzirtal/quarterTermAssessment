public class Plane extends Vehicle implements Flyable{


    public Plane(String name, int speed, float price, Engine engine) {
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
    public boolean transportsPassengers() {
        return true;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "speed=" + getSpeed() +
                ", price=" + getPrice() +
                ", engine=" + getEngine(engine.getSize()) +
                ", TAX_AMOUNT=" + getTAX_AMOUNT() +
                '}';
    }
}
