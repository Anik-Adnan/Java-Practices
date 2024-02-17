package NestedClass;

//AnonymousInnerClass cannot implement more than one interface
//AnonymousInnerClass can implement more than one interface in following way >
// Interface which will extend Runnable interface
public class C7 {
    int v=100; // outerClass instance variable cannot be accessed in anonbymous innerClass
    // because compiler can not provide outerClass refernce through constructor


    public static void main(String[] args) {
        Test t=new Test();
        fun(t); // not anonymous , because object are available
        fun(new Test());//anonymous object // annonymous inner class // no specific name, and reference variable//
        new Test().show(); // anonymous method


        // we cannot create interface object,we have to create a class ,implements interface methods, and create class object ,call interface method

        IntfImpt i=new IntfImpt();
        i.intfMethod();
        // with anonymous inner calss, create interface object,and call  the method
        Intf intf=new Intf() { // C7$1.class // concreate class,not a interface
            //compiler , C7$1 implements Intf{}, diff name provide a complier after compilation, or normal class implementation class can take a ClassName before compilation
            ///complier will giva a constructor C7$1(){}

            @Override
            public void intfMethod() {
                System.out.println("annonymous inner class");
            }

            public void normalMethod(){
                System.out.println("Normal method in anonymous class");
//                System.out.println(v); // not possible // here main method is static, without static it is possible
                // without static main, compiler provide a constructor
            }
        };
        intf.intfMethod(); // method calling through interface object
//        intf.normarMethod(); //  interface Intf


        int value=10;
//        intf.normalMethod(); // that is not possible
        new Intf(){ //C7$2.class

            public void intfMethod() {
                System.out.println("annonymous inner class");
            }
            public void normalMethod(){
                System.out.println("Normal method in anonymous class");
                System.out.println(value); // local // final or effectively final // if we change value later, not possible
            }

        }.normalMethod(); // need anonymous object for accessing ,outer methods of interface

//        value=45; // stack, LVA te assign hobe, effectively finla hote hobe
        // thread0, stackName,stack LVA te entry porbe
        // local variable thread safe
        new Thread(()->{
            intf.intfMethod();
        }).start();

    }

    public static void fun(Test test){
        System.out.println(test.v);
    }
}
class Test{
    public int v=10;
    void show(){
        System.out.println("anonymous method");
    }

}
interface Intf{
    void intfMethod();
}
class IntfImpt implements Intf{
    public void intfMethod(){
        System.out.println("this is simple method");
    }
}
