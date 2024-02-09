package Generics;

import java.util.ArrayList;

public class Part06 {
    public static void main(String[] args) {
        ArrayList<Integer> i=new ArrayList<>();
        i.add(1);
        i.add(5);
        System.out.println(i);

        m(i);
        System.out.println(i);

        m2(i);
    }

    public  static void m(ArrayList l){
        // non generic area , do not have any type safety
        l.add("hello");
        System.out.println(l);



        ArrayList<E> a=new ArrayList<>();
        m3(a);
        E e =a.get(0); //new G()
    }

    //upper wildcard
    public  static void m2(ArrayList <? extends Number> l){
//        l.add(12); //write not suitable but read is suitable
        System.out.println(l);
    }
    //lowerbounded wildcard
    public static void m3(ArrayList< ? super E> l){

        E e =new E();
        G g =new G();
        l.add(g);
    }
}
class E{

}
class G extends E{

}
class K extends G{

}