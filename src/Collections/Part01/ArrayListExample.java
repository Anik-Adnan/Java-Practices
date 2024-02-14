package Collections.Part01;

import jdk.jshell.execution.Util;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        System.out.println("ArrayList: " + list);

        //add "dart" in index 0 and index 0 value moved to the index 1 that is "Java"
        list.add(0,"Dart");
        System.out.println(list);

        list.set(0,"JAVA"); //replaced 0 index value 'JAVA'
        System.out.println(list);
        System.out.println("capacity: "+ list.toArray().length+ " size: "+list.size());
    }
}
