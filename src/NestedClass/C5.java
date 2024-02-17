package NestedClass;
import static NestedClass.Oouter.*;
class Oouter{
    public static int xx=66;
    // static feilds are accessible in non-static area or methods area
    // beacuse static property are available in classLoading Time
    // or instance_property concepts come after object creation

    public int v=100;
    // nonStatic feilds are not accessible in static block or methods



    {
        // insatnce area, non-static area
        System.out.println(xx);// xx static veriable
    }
    static {
        // static area
//        System.out.println(v); // v nonStatic veriable //
        // for accessing 'v' , we have to create an object of v;
       Oouter ob=new Oouter();
        System.out.println(ob);

    }
    void fun(){
        System.out.println(xx);
    }



    public  static class StaticNestedclass{
        // modifier abstruct,interface not possible
        // static can access only static property
        // complier does not pass constructor with outerClass referenceVeriable for staticNestedClass, and
        // we don't need outerClass object beacause it is static

        public static int sv=10;
        int v;


        {
            System.out.println("non static block posible");
        }
        StaticNestedclass(){
            // constructor possible
        }
        static void fun(){
            int sv=20;
            System.out.println(sv); // 20
            System.out.println(StaticNestedclass.sv); //10  className.variableName
//            System.out.println(this.sv); // this not allow in static block,method,

        }


    }
}
public class C5 {
    public static void main(String[] args) {
         // obj creation of static class
        Oouter.StaticNestedclass obj=new Oouter.StaticNestedclass();
        // if we declare the static import,then we can do
        Oouter.StaticNestedclass obbj=new StaticNestedclass();
        obbj.fun();


    }
}
