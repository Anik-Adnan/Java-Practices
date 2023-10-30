package test;

import java.lang.*; //default package of java
public class Main {
    static int a;
    String s;
    static{
        int v=10;
        System.out.println("static called-1 v=" +v);
    }
    {

        System.out.println("Not- static block called");
    }


    public Main() {
        System.out.println("constructor called ");
    }
    void fun(){
        int v;
        v=10;
        System.out.println("Local variables value must be assigned, value v= " +v);
    }

    public static void main(String[] args) {

        //constan define korar niyom
//        public static final pi =3.1416E00; //method er vitor likhte hobe
        Main obj=new Main();
        System.out.println("defauled value    static  called- a = "+obj.a);
        System.out.println("defauled value Non-static called s = "+obj.s);
        obj.fun();
        Main obj2=new Main();
        a=55;
        System.out.println("defauled value    static  called a = "+obj2.a);

        System.out.println("Hello world! called");
    }
}