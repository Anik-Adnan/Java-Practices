package test;

public class MainSingletonClass {
    public static void main(String[] args) {
        SingletonDesign obj=SingletonDesign.getInstance();
        System.out.println(obj.sayHello());
        System.out.println(obj);

        SingletonDesign obj2=SingletonDesign.getInstance();
        System.out.println(obj.sayHello());
        System.out.println(obj); // all object allocates same memory
    }
}
