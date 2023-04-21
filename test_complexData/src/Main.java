import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static String[] vehicles = {
      "ambulance", "helicopter", "lifeboat"
    };

    public static String[][] drivers = {
            {"Fred", "Sue", "Pete"},
            {"Sue", "Richard", "Bob", "Fred"},
            {"Pete", "Mary", "Bob"},
    };

    public static void main(String[] args) {

        Map<String, Set<String>> personal = new HashMap<>();

        for (int i = 0; i < vehicles.length; i++){
            String vehicle = vehicles[i];
            String[] driverList = drivers[i];

            Set<String> driverSet = new LinkedHashSet<String>();

            for (String driver: driverList){
                driverSet.add(driver);
            }
            personal.put(vehicle, driverSet);
        }

        Set<String> driverList = personal.get("helicopter");

        for (String driver: driverList){
            System.out.println(driver);
        }

        for (String vehicle: personal.keySet()){
            System.out.println(vehicle);

            Set<String> driversList = personal.get(vehicle);

            for (String driver: driversList) {
                System.out.println(driver);
            }
        }
        
    }
}