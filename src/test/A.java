package test;

public class A {
    public String name;
    {
        System.out.println("class-A Non-instant block");
    }
    A(String name){
        this.name=name;
        System.out.println("class-A constructor called");
    }
}
class B extends A{
    public int age;

    {
        System.out.println("class-B Non-instant block");
    }

    B(int age){
        super("Anik");
        this.age=age;
        System.out.println("class-B constructor called");
    }

    @Override
    public String toString() {
        return "B{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        B obj=new B(22);
        System.out.println(obj);
    }
}
