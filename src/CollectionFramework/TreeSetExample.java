package CollectionFramework;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Orange");
        set.add("Apple");
        set.add("Banana");
        System.out.println("TreeSet: " + set);
        System.out.println("head set: "+set.headSet("Orange"));
        System.out.println("tail set: "+set.tailSet("Banana",false)); // without 'banana'

    }
}
