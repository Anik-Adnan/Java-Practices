package MultiThreading;

public class Part7 {
    public static void main(String[] args) {

        InterfaceClass i =new InterfaceClass(){

            @Override
            public void sayHello() {
                System.out.println("Annonymous interface class");
            }
            public void fun(){
                System.out.println("fun not present in interfaceClass");
            }
        };
        i.sayHello();
        InterfaceClass b=new B();
        b.sayHello();

        new InterfaceClass(){

            @Override
            public void sayHello() {
                System.out.println("Annonymous interface class");
            }
            public void fun2(){
                System.out.println("fun not present in interfaceClass");
            }
            //extra only one method can be call like fun2,other wise compiler error CZ fun2 not present in interface class body
        }.fun2();




    }
}
interface InterfaceClass {
    public void sayHello();
}
class B implements InterfaceClass {

    @Override
    public void sayHello() {
        System.out.println("class B ");
    }
}

