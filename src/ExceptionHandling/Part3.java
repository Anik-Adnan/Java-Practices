package ExceptionHandling;

public class Part3 {
    public static void main(String[] args) {
        m1();
        System.out.println("from main");
    }
    static void m1(){
       try{
           m2();
       }catch (ArithmeticException e){
           System.out.println(e);
//           e.printStackTrace(); //fulstack trace
       }
        System.out.println("from  m1");
    }
    static void m2(){ // automatically propagated  by jvm
        try{
            int n=1/0;
            String s=null;
            System.out.println(s.length());
        }catch (NullPointerException e){
            System.out.println(e);
            // alternate code for nullpointer exception
        }
        catch (ArithmeticException e){
            System.err.println(e);
            // alternate code for Arithmatic exception
        }
        catch (Exception e){ // always provide correctexception
            e.printStackTrace();

            //another way for cathing mutiple catch block
            if( e instanceof ArithmeticException){
                //alternate code for Arithmatic exception
            } else if (e instanceof NullPointerException) {
                //alternate code for Nullpointer exception
            }
        }finally {
            System.out.println("finally block in m2"); //if cotrol go to the try block,hten finally block always be executed if it has.
        }
        System.out.println("from m2");
    }
}
