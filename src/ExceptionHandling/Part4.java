package ExceptionHandling;

public class Part4 {
    public static void main(String[] args) {
        try{
            try {
                String s=null;
                System.out.println(s.length());
            }catch (ArithmeticException e){
                System.out.println(e);
            }
            System.out.println("inner try catch block");

        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("main fast end");


        try{
            String s=null;
            System.out.println(s.length());
            try {
                int n=1/0; // control not come insode try block

            }catch (ArithmeticException e){
                System.out.println(e);
            }
            finally {
                System.out.println("finally of inner try"); // not enter insside try then finally not be executed
            }
            System.out.println("inner try catch block");

        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("main last end");
    }
}
