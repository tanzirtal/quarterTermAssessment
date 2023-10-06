public abstract class Vehicle extends Product{
    private int speed;
    private float price;
    Engine engine;
    protected final float TAX_AMOUNT = .10f;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Engine getEngine(Size size) {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public float getTAX_AMOUNT() {
        return TAX_AMOUNT;
    }

    public Vehicle(String name, int speed, float price, Engine engine) {
        super(name);
        this.speed = speed;
        this.price = price;
        this.engine = engine;
    }

    public abstract void printVehicleType(Vehicle vehicle);


    public abstract float getPriceAfterTax(Vehicle vehicle);


}
