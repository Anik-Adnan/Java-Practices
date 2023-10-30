package day_07;

public class Intf3 {
    public static void main(String[] args) {
        C2 i=new C2();
        i.fun();
        i.displayDefault();
    }
}

interface I{
    public abstract void fun();
}
interface I2{
    default void m(){
        System.out.println("deafult method in interface");
    }

}
abstract class Cc implements I{
//    Class 'C' must either be declared abstract or implement abstract method 'fun()' in 'I'
    public void fun(){
        System.out.println("simple Class mehod");
    }
}
class C2 extends Cc implements I,I2 {

//    public void fun() { // fun method already avialable in Cc class
//        System.out.println("Interface method");
//    }
     void displayDefault(){
         I2.super.m();
    }
}
