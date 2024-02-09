package Generics;

import java.util.ArrayList;

public class Part02<T> extends Test<T>{

    public static void main(String[] args) {
        Test tt=new Test(); //m(Object type),inte(Object type)


        Test<String> t=new Test();
        t.m("Hello");

        Test<Integer> i=new Test<>();
        Integer val=i.inte(1,2,3,4);
        System.out.println(val);


        Person<Integer,ArrayList> p=new Person<>();
        ArrayList a=new ArrayList();
        a.add("ANik Adnan");
        a.add(25);
        a.add("ICT");
        System.out.println(p.information(1,a));

    }

    @Override
    void m(T t) {
        super.m(t);
    }

    //if extends without type,by default Object type
//    @Override
//    void m(Object o) {
//        super.m(o);
//    }

}
class Test<T>{ //elemens=E,type=T parameter,
    void m(T t){
        System.out.println(t);
    }
    T inte(T... t){
        return t[0];
    }
}

class Person<ID,Info>{
    ArrayList information(ID id,Info info){
        return (ArrayList) info;
    }
}
