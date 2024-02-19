package CollectionFramework;

import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

class Students {
    public String name;
    public int id;

    public Students(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}


public class TreeSetComparatorExample02 {
    public static void main(String[] args) {


        Comparator<Students> comperator = new Comparator<Students>() {
            @Override
            public int compare(Students s1, Students s2) {
                return Integer.compare(s1.getId(), s2.getId());
            }
        };

        TreeSet<Students> treeSet =new TreeSet<Students>(comperator);


        // Adding elements to the TreeSet
        treeSet.add(new Students("Alice", 101));
        treeSet.add(new Students("Bob", 106));
        treeSet.add(new Students("Anik", 1015));
        treeSet.add(new Students("ALu", 105));
        treeSet.add(new Students("Charlie", 100));

        // Displaying the elements of the TreeSet (sorted by id)
        System.out.println("TreeSet (sorted by id): " + treeSet);
        System.out.println(treeSet.comparator() == comperator); //same object 'true'
    }
}

