package ExceptionHandling;

public class Part11_FinallyDemo {
    static void meth1( ) throws Exception {
        try{
            throw new Exception();
        }
        finally {
            System.out.println("final message");
        }
    }
    public static void main(String[] args) throws Exception {
        meth1();
    }
}
