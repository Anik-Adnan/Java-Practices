package Interfaces;

public class DimondProblem {
    public static void main(String[] args) {

    }
}
abstract class A{
//    public void fun(){
//        System.out.println("A class");
//    }
    public abstract void fun();

}
class B extends A{
    public void fun(){
        System.out.println(" B class");
    }
}
class C extends A{
    public void fun(){
        System.out.println(" C class");
    }
}

//class D extends B,C{
//    // multiple class is not possible
//    // same method have in two class B and C
//}

