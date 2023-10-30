package day_06;

// nested/inner method does not support in java
// but inner_class or nested_Class is support in java
class A{

    class B{
        // nested or inner class
        // normal inner class
    }

    static class C{
        // static nested class
    }

    void localClass(){
        class Local{
            //method Local inner class
        }
    }
     // annonymour inner class,,, a class without className
//     Supplier<Integer> supplier=new Supplier<Integer>(){
//        // function interface
//        public Integer get(){
//            return 55;
//        }
//    };
}

public class Part01 {
    public static void main(String[] args) {

    }
}
