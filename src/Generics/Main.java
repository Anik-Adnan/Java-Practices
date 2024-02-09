package Generics;

import java.util.ArrayList;
import java.util.List;

public class Main<T> extends Testt<T> {
    public static void main(String[] args) {
        ArrayList<Integer> i =new ArrayList<>();
//        ArrayList<Number> ln= i; //new ArrayList<>(); // be converted to Integer

        List<Integer> n=i;
//        List<Number> l=i; //error


        //inharitance rules
        Main<Integer> m=new Main<>();
        Testt<Integer> t=m;


        //wildcalt
        ArrayList<Number> an=new ArrayList<>();
        m(an);
    }
    //wildcard
    public static void m(ArrayList<?> l){ // '?' any type

    }
}
class Testt<T>{

}