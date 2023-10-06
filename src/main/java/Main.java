import java.util.*;
import java.util.Map;
import java.util.List;
import java.util.HashMap;

public class Main {

    public static void formattedPriceAfterTax(Vehicle vehicle){
        System.out.println(vehicle.getPriceAfterTax(vehicle));
    }

    public static void main(String[] args) {
        Engine smallEngine = new Engine(Size.SMALL);
        Engine mediumEngine = new Engine(Size.MEDIUM);
        Engine largeEngine = new Engine(Size.LARGE);
        Car myCar = new Car("BMW M8", 200, 160000.00f, smallEngine, 2);
        Truck myTruck = new Truck("Ford F-150", 100, 50000.00f, mediumEngine);
        Boat myBoat = new Boat("Pontoon", 50, 135000.00f, largeEngine, true);
        Plane myPlane = new Plane("AC130", 600, 200000000.00f, largeEngine);
        Drone myDrone = new Drone("Maverick x1000");
        FlyingCar myFlyingCar = new FlyingCar("DaVinci's Wisdom", 10000, 555555555.99f, largeEngine);

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(myCar);
        vehicles.add(myTruck);
        vehicles.add(myBoat);
        vehicles.add(myPlane);

        VehicleApp.printListOfVehicleNames(vehicles);

        //need to override the ToString for Drone,Plan,Flying Car classes
        List<Flyable> flyableObjects = new ArrayList<>();
        flyableObjects.add(myDrone);
        flyableObjects.add(myPlane);
        flyableObjects.add(myFlyingCar);

        //didn't have time to adjust the output to the correct values.
        //Need to figure out how to populate engine size correctly and to adjusted price properly
        VehicleApp.printListOfFlyableObjects(flyableObjects);

        HashMap<Integer, String> passengerList = new HashMap<Integer, String>();
        passengerList.put(57, "Wesley Snipes");
        passengerList.put(007, "James Bond");

        VehicleApp.printPassengerNumbersOnly(passengerList);

        myCar.getPriceAfterTax(myCar);







    }
}
