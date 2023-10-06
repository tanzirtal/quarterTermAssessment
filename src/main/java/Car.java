public class Car extends Vehicle implements Driveable{

    private int numberOfDoors;
    private float extraTax = 0.05f;

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public float getExtraTax() {
        return extraTax;
    }

    public void setExtraTax(float extraTax) {
        this.extraTax = extraTax;
    }

    public Car(String name, int speed, float price, Engine engine, int numberOfDoors) {
        super(name, speed, price, engine);
        this.numberOfDoors = numberOfDoors;
    }

    public void printNumberOfDoors(){
        System.out.println(getNumberOfDoors());
    }

    @Override
    public void printVehicleType(Vehicle vehicle) {
        System.out.println(vehicle.getName());
    }

    @Override
    public float getPriceAfterTax(Vehicle vehicle) {
        float vehiclePriceAfterTax = getPrice() + (getPrice() * (TAX_AMOUNT+extraTax));
        System.out.println(vehiclePriceAfterTax);
        return vehiclePriceAfterTax;
    }

    @Override
    public void printSpeed() {
        System.out.println(getSpeed());
    }
}
