import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    public static void main(String[] args) {
        //Look up API doc for queue to ref more queue methods...
        //add, remove, poll, peek...
        Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);
        q1.add(10);
        q1.add(20);
        q1.add(30);
        try {
            q1.add(40);
        }catch (IllegalStateException e){
            System.out.println("Queue is full!!!");
        }
        for (Integer val: q1){
            System.out.println("Queue value: " + val);
        }

        Integer val = q1.remove();
        System.out.println("Removed: " + val + " from queue");


    }
}