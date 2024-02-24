package CollectionFramework;

import java.util.Comparator;
import java.util.TreeSet;

class Persons {
    private String name;
    private int age;

    public Persons(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class TreeSetComparatorExample01 {
    public static void main(String[] args) {
        // Creating a custom Comparator to sort Person objects by name
        Comparator<Persons> nameComparator = Comparator.comparing(Persons::getName);

        // Creating a TreeSet of Person objects with custom Comparator
        TreeSet<Persons> treeSet = new TreeSet<>(nameComparator);
//        TreeSet<Persons> treeSet =new TreeSet<>(); // errror

        // Adding elements to the TreeSet
        treeSet.add(new Persons("Alice", 30));
        treeSet.add(new Persons("Bob", 25));
        treeSet.add(new Persons("Charlie", 35));

        // Displaying the elements of the TreeSet (sorted by name)
        System.out.println("TreeSet (sorted by name): " + treeSet);
    }
}
