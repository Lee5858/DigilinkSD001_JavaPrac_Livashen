import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //Create empty hashmap with object of sting and integer
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        //Add elements to the hashmap
        map.put(5, "Five");
        map.put(8, "Eight");
        map.put(2, "Two");
        map.put(10, "Ten");
        map.put(6, "Six");

        /*String txt = map.get(5);

        System.out.println(txt);
        */
        //iterate through the hashmap
        for (Map.Entry<Integer, String> entry : map.entrySet()){
            int key = entry.getKey();
            String val = entry.getValue();

            System.out.println(key + " " + val);
        }
        //Size of the hashmap
        System.out.println("The map size is: " + map.size());
        //Condition check if a key is viable and print its value...
        if (map.containsKey(5)){
            //Mapping
            String a = map.get(5);
            //Final value output
            System.out.println("Value key of "+"\"5\" is: " +a);


        }

    }
}