import java.util.HashMap;
import java.util.Map;

public class Passenger {
    HashMap<Integer, String> info = new HashMap<>();

    public HashMap<Integer, String> getInfo() {
        return info;
    }

    public void setInfo(HashMap<Integer, String> info) {
        this.info = info;
    }

    public Passenger(HashMap<Integer, String> info) {
        this.info = info;
    }
}
