import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

        testMap(treeMap);

    }

    public static void testMap(Map<Integer, String> map){
        map.put(2, "Cat");
        map.put(15, "Dog");
        map.put(9, "Lion");
        map.put(5, "Wolf");
        map.put(8, "Mouse");

        for (Integer key: map.keySet()){
            String val = map.get(key);

            System.out.println(key + ": " + val);
        }
    }

}