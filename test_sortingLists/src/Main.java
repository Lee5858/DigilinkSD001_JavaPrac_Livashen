import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person{
    private int id;
    private String name;

    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return id + " : " + name;
    }
}

class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2){

        int len1 = s1.length();
        int len2 = s2.length();

        if (len1 > len2){
            return 1;
        } else if (len1 < len2) {
            return -1;
        }
        return 0;
    }
}

class AlphabeticalComparator implements Comparator<String>{
    @Override
    public int compare(String s1, String s2){

        return -s1.compareTo(s2);
    }
}

public class Main {
    public static void main(String[] args) {
        //Sorting a list of strings
        System.out.println();
        System.out.println("Animals:");
        List<String> animals = new ArrayList<String>();
        animals.add("Cat");
        animals.add("Elephant");
        animals.add("Rhino");
        animals.add("Wolf");
        animals.add("Dog");
        animals.add("Monkey");
        //Collections.sort(animals, new StringLengthComparator());
        Collections.sort(animals, new AlphabeticalComparator());
        for (String animal: animals){
            System.out.println(animal);
        }

        System.out.println();

        //Sorting a list of numbers
        System.out.println("Numbers:");
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(29);
        numbers.add(12);
        numbers.add(3);
        numbers.add(8);
        numbers.add(55);
        numbers.add(7);
        numbers.add(11);
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                return -num1.compareTo(num2);
            }
        });
        for (Integer number: numbers){
            System.out.println(number);
        }

        //Sorting Arbitrary classes//

        List<Person> people = new ArrayList<Person>();

        people.add(new Person(1, "Bob"));
        people.add(new Person(2, "Joe"));
        people.add(new Person(4, "Many"));
        people.add(new Person(3, "Chris"));

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                if (p1.getId() > p2.getId()){
                    return 1;
                } else if (p1.getId() < p2.getId()) {
                    return -1;
                }
                return 0;
            }
        });

        System.out.println();
        System.out.println("People:");

        for (Person person: people){
            System.out.println(person);
        }

    }
}