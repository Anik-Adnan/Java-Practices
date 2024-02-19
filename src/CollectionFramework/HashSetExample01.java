package CollectionFramework;

import java.util.HashSet;

public class HashSetExample01 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Blue");
        System.out.println("HashSet: " + set);
    }
}
