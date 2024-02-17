package Interfaces;

public class Main {
    public static void main(String[] args) {
        
    }
}


interface Intf {
    // compiler time resolved,in classLoading time
    int sv = 0; // by default public static final
//    static {
//        // static block not allowed in inteface
//    }

//    {
//        //instance block not allowed in interface
    // object creation is not possible for interface, constructor does nt need, that's why instance block isn't nesessary
//    }



    public abstract void fun(); //"simple inteface by default public abstract"
    public abstract String toString();
    // default method can be created in interface but modifier always public by default
    //after java 8, default mehtod is possible in interface
    public default void defaultMethod()
    {
        // dfault mehod modifier always public

    }





}

class Simple{
    //differnce between interface and class
    // access modifier used for vaiable in a class, but interface bydefault pulic stattic final
    protected int pv;
    {
        // insatce block can be used in a class
    }
    static {
        // static block can be used in class
    }
    // normal and abstract method can be declared in a class
//    abstract void fun(); // if method  is abstract than class must be abstract
    // have a constructor,
    //// abstract method modifiers are changeable in class
    // class can extends only one clss at a time
    // but interface can implements multiple interface
}
