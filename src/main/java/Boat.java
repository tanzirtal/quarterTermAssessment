public class Boat extends Vehicle implements Driveable{
    private boolean hasGPS;

    public boolean isHasGPS() {
        return hasGPS;
    }

    public void setHasGPS(boolean hasGPS) {
        this.hasGPS = hasGPS;
    }

    public Boat(String name, int speed, float price, Engine engine, boolean hasGPS) {
        super(name, speed, price, engine);
        this.hasGPS = hasGPS;
    }

    public void printGpsInfo(){
        System.out.println(isHasGPS());
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
}
