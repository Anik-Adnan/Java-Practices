package ExceptionHandling;

public class Part7 {
    public static void main(String[] args) {
        try{
            ArithmeticException obj=new ArithmeticException();
            throw obj;
//            throw new ArithmeticException("exception will be handle menualy ");
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("main end");
    }
}
