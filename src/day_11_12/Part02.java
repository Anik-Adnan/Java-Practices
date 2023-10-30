package day_11_12;

public class Part02 {
    public static void main(String[] args) {
        System.out.println(m()); // print 50
    }
    static int m(){
        try{
            System.out.println("try block");
            return 10;
//            return 10/0;
//            System.out.println("Unreachable Statement");
        }catch (Exception e){
            System.out.println(e.getStackTrace());
            System.out.println("catch block");
            return 100;
        }
        finally {
            System.out.println("finally block");
            return 50; // print 50 // overWrite return value, collaps previous return value
        }
//        return 40; // unreachable statement
    }
}
