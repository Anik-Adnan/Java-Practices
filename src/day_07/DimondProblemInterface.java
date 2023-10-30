package day_07;

public class  DimondProblemInterface {
    public static void main(String[] args) {
        Dcls a=new Dcls();
        a.show();
        a.fun();

    }
}
 interface Acls {
        public abstract void fun();
     default void show(){
         System.out.println("default method from AA class");
     }



}
interface Bcls //extends  Acls
{
     public  abstract void fun();
     default void show(){
         System.out.println("default method from BB class");
     }
}
interface Ccls //extends Acls
{
    public abstract void fun();
    default void show(){
        System.out.println("default method from CC class");
    }
}

class Dcls implements Bcls, Ccls {
    // multiple interfacee , imlementation happens only one time

    public void show(){
        Bcls.super.show();
        Ccls.super.show();
    }
    public void fun(){
        System.out.println("Fun method from DD class");
    }
}