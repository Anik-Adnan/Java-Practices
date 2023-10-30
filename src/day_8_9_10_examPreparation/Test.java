package day_8_9_10_examPreparation;

public class Test {
    public static void main(String[] args) {
        Parent p=new Child();
        System.out.println(p.v);



    }


}
class Parent{
    int v=10;// variable does not
    private void display(){ //method is private not accessible in child class
        System.out.println("private display");
    }


}
class Child extends Parent{
    int v=20; // variable does not override
    public void display(){
        System.out.println("public display , this is new method in child classs, not comming through inherited");
    }

}