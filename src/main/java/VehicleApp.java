import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VehicleApp {
    public static void printListOfVehicleNames(List<Vehicle> vehicles){
        for(Vehicle myVehicles : vehicles){
            System.out.println(myVehicles.getName());
        }
    }

    public static void printListOfFlyableObjects(List<Flyable> flyableObjects){
        for(Flyable myFlyables : flyableObjects){
            System.out.println(myFlyables);
        }
    }

    //confused on the Comparator portion
    public static void sortAndPrintDriveableVehiclesBySpeed(List<Driveable> vehicles){
        vehicles.sort(Comparator.comparingInt());

        for (Driveable vehicle : vehicles){
            vehicle.printSpeed();
        }
    }

    public static void printPassengerNumbersOnly(Map<Integer,String> passengerList){
        System.out.println(passengerList.keySet());
    }
}
