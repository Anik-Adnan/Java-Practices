package CollectionFramework;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

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

        // new list
        ArrayList<Integer> ar=new ArrayList<>();
        ar.add(10);
        ar.add(15);
        ar.add(20);
        ar.add(18);
        ar.add(31);ar.add(25);ar.add(47);ar.add(55);

        //replaceAll()
        ar.replaceAll(new UnaryOperator<Integer>(){
            @Override
            public Integer apply(Integer integer) {
                if(integer %3==0)
                    return 3;
                return integer;
            }
        });

        //remove ()
        System.out.println("raplaced array: "+ar);
        ar.remove(0); // '0' primitive value for indexwise removing
        ar.remove(new Integer(20)); // // pass object for valuewise removing


        System.out.println("index of 0 :"+ar.indexOf(1)+" contains 10:"+ar.contains(10));
        System.out.println("after removing 10,20 : "+ar);
        //removeif()
        ar.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer%5==0;
            }
        });
        System.out.println("remove predicate val%5==0 :  "+ar);

        //for each method
        ar.forEach(System.out::println);
        //clone ar arraylist
        System.out.println((List<Integer>) (ar.clone()));

        Object[] newar=ar.toArray();
        System.out.println("print object location: "+newar);
        System.out.println(Arrays.toString(newar));

        //retainAll() ,if all elements are matched =>'false'
        List<Integer> l2=Arrays.asList(3, 3, 31, 47);
        System.out.println(ar.retainAll(l2)); //flase

    }
}
