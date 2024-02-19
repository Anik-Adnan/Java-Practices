package CollectionFramework;

import java.util.TreeSet;

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Implementing compareTo method for natural ordering based on age
    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class TreeSetComparableExample {
    public static void main(String[] args) {
        // Creating a TreeSet of Person objects
        TreeSet<Person> treeSet = new TreeSet<>();

        // Adding elements to the TreeSet
        treeSet.add(new Person("Alice", 30));
        treeSet.add(new Person("Bob", 25));
        treeSet.add(new Person("Charlie", 35));

        // Displaying the elements of the TreeSet (sorted by age)
        System.out.println("TreeSet (sorted by age): " + treeSet);
    }
}
