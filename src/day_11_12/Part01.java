package day_11_12;
/*
    1.checked exception (compile time exception)
        fully checked exception (IO exception,sqlException..etc)
        Partially checked exception (Exception, Throwable ..etc
    2.unchecked exception (runtime exception) (ArithmeticException,ArrayIndexOutOfBoundsException,NumberFormatException)
    there are 5 keyword in exception
        1. try block (risky code written here)
        2. catch block ( alternative code )
        3. finally block (cleanup code)
        4. throw
        5. throws


 */
public class Part01 {
    public static void main(String[] args) {
        // have a another package for exceptio handling named "ExceptionHandling"
        try{
            System.out.println(1/0);
            System.out.println("print 1/0");
        }catch (Exception e){
            System.out.print("exception occurred : ");
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
        finally {
            System.out.println("Finally block");
        }
        System.out.println("hello world");
    }

}

