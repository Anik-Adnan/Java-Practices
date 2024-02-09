package Generics;

import java.util.ArrayList;

public class Part01 {
    public static void main(String[] args) {
        String[] a=new String[100];
        a[10]="anik adnan";
        System.out.println(a[10]);

//        generics need
//            1. type safety
//                2. resolve type casting
        ArrayList n=new ArrayList();
        n.add(10);
        n.add("hello");
        n.add(12.05);
        n.add(new Object());
        System.out.println(n);

        //generics integer type
        ArrayList<Integer> in =new ArrayList<>();
        in.add(1245);
//        in.add(12.5); // error incompatible size
        System.out.println(in);

        ArrayList ar=new ArrayList();
        ar.add(12);
        ar.add(12.5);
        ar.add("string");

//        Integer i= (Integer) ar.get(2);//get() Object Type //ClassCastException //get string ,cast int
        Integer i= (Integer) ar.get(0);
        System.out.println(i);

        ArrayList<Float> f=new ArrayList<>();
        f.add(12.5f);
//        f.add(112);//incompatible type
        Float nf= f.get(0); //get() Float type //no need typecasting
        System.out.println(nf);
    }
}
