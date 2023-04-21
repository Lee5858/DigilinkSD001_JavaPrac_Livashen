import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> animals = new LinkedList<String>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Mouse");
        animals.add("Snake");
        animals.add("Car");

        Iterator<String> it = animals.iterator();

        while(it.hasNext()) {
            String animal = it.next();
            if (animal.equals("Car")) {
                it.remove();
            }
            System.out.println(animal);
        }
        System.out.println();

    }
}