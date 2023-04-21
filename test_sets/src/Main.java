import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //Hash Sets have no order...
        //Set<String> set1 = new HashSet<String>();

        //Linked Hash Sets retain original order...
        //Set<String> set1 = new LinkedHashSet<String>();

        //Tree Sets have natural order...
        Set<String> set1 = new TreeSet<String>();

        set1.add("Dog");
        set1.add("Cat");
        set1.add("Snake");
        set1.add("Mouse");

        //Duplicate items don't get added!!!
        set1.add("Dog");
        System.out.println(set1);

        //Set Iteration
        for (String element: set1){
            System.out.println(element);
        }

        //Set condition check
        if(set1.contains("Bird")){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
        if (set1.contains("Cat")) {
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}