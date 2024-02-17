package Collection;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(60); //initial capacity 60
        //array capacity_size= (3*present capacity)/2 , initialy capacity =10
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

        ArrayList a=new ArrayList();
        Random random=new Random();
        Scanner sc =new Scanner(System.in);
        System.out.println("enter 10 elements: ");
        for (int i = 0 ; i <10 ; i++) {
//            a.add(sc.nextInt());
            a.add(random.nextInt(100)+1);
        }


        System.out.println("array element: "+a);
        a.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer t1, Integer t2) {
//                return t2.compareTo(t1); //ascending order
                return t2.compareTo(t1); //decending order
            }
        });
        System.out.println("sorted array: "+ a);



    }
}
