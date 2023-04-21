import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(60);
        linkedList.add(40);
        linkedList.add(50);

        linkedList.set(2, 30);
        /* //Using get method in the for loop to iterate...
        for (int i=0; i<linkedList.size(); i++){
            System.out.println(linkedList.get(i)+"");
        }
        System.out.println();

        //Using for each loop...
        for (int num : linkedList){
            System.out.print(num+" ");
        }
        */
        System.out.println("LinkedList: " + linkedList);
        //Convert LinkedList to Array...
        Object[] a = linkedList.toArray();
        System.out.print("Linked to Array conversion: ");
        for (Object element : a){
            System.out.print(element+ " ");
        }
    }
}