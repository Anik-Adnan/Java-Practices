package ExceptionHandling;

public class Part1 {

    public static void main(String[] args) {
        int a[]={1,2,3};
        try{
            System.out.println(a[3]);
            System.out.println(div(4,2));

        }catch (Exception e){
            System.err.println(e.getMessage());
            e.printStackTrace();
            System.out.println(a[a.length-1]);
        }
        System.out.println(div(4,2));


    }
    static int div(int a,int b){
        try{
            return a/b;
        }catch (ArithmeticException e){
            e.printStackTrace();
            return 0;
        }finally {
            return -1; // nerver back to the catch , and try block again
        }
    }

}
