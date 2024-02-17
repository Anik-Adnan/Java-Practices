package NestedClass;

// top level class or encloser class always non-static
// default,public,final,stritfp,abstract modifiers are used for top level class
// for inner class top_level modfiers + static,protected,private
class Outer{
    private  int v=10; // private are accessible in inner class, because they are in same class
    // complier provide a constructor by default
//    public Outer(){
//        super();
//        this.v=10;
//    }
    public static int outerStaticVariable=44;
    static void outerStaticMethod(){
        System.out.println("Outer static method");
    }
    class Inner{
        int v2=28;
        static  final int vv=10;
        static {

        }
        // inner class
        // inner class compiler doesnot provide a constructor
        // compiler provide a reference variavle of outer class
//        final Outer this$0;
//        Inner(Outer outer){
//            super();
//            this$0=outer;
//            this.v2=2 8;
//        }
        {
            // instance block possible
        }
        static{
            System.out.println("static block in inner class");
        }
        static void display(){
            System.out.println("static method in inner class");
            System.out.println("static variable "+innersSaticVariable);
        }
        static  int innersSaticVariable=10;


        void fun(){
            System.out.println(v); // for accessing 'v' must create outer class object
//            System.out.println(this$0.v);
            System.out.println(outerStaticVariable);
        }

        // static method and static field or static block  is possible in NormalInnerClass ,but possible within java 16
        // but static final is possible
    }

    Outer.Inner inr= this.new Inner(); // create inner class object, outside inner_class inside OuterClass
    void calligMethod(){

        System.out.println("outside inner ,inside outer method"); // static property is not accessible in outer class
    }

    interface m{
        public abstract void fun();
    }

}

public class C2 {
    public static void main(String[] args) {
        Outer outer=new Outer();
        System.out.println(outer);
        // to create inner class object, fast create outer class object
        Outer.Inner inner  = outer.new Inner();
        Outer.Inner inner2 = new Outer().new Inner();
        inner2.fun();
        outer.calligMethod();



    }
}
