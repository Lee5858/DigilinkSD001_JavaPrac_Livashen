import java.util.*;

class Person implements Comparable<Person>{
    private String name;

    public Person(String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * ((name == null) ? 0 : name.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Person person = (Person) o;
        if (name == null){
            if (person.name != null){
                return false;
            }
        } else if (!name.equals(person.name)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Person person) {
        int len1 = name.length();
        int len2 = person.name.length();
        
        if (len1 > len2){
            return 1;
        } else if (len1 < len2) {
            return -1;
        }else {
            return name.compareTo(person.name);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        List<Person> list = new ArrayList<Person>();
        SortedSet<Person> set = new TreeSet<Person>();

        addElements(list);
        addElements(set);

        Collections.sort(list);

        showElements(list);
        System.out.println();
        showElements(set);


    }

    private static void addElements(Collection<Person> col){
        col.add(new Person("Joe"));
        col.add(new Person("Sue"));
        col.add(new Person("Bob"));
        col.add(new Person("Amy"));
        col.add(new Person("Lee"));
    }
    private static void showElements(Collection<Person> col){
        for (Person element: col){
            System.out.println(element);
        }
    }
}