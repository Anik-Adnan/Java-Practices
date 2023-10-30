package ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;
import java.util.logging.SocketHandler;

public class Part2 {
    public static void main(String[] args){
//        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
//            @Override
//            public void uncaughtException(Thread t, Throwable e) {
//                System.out.println(t+","+e); // nt jvm default handler
//            }
//        });

        m1(); // jvm default exception handler handle this, if we do not handle any excepion

        System.out.println("main end");


    }
    static void m1(){
       try{ m2();}
       catch (IOException e){
           e.printStackTrace();
           System.err.println(e);
       }
        System.out.println("m1 end");

    }
    static void m2() throws IOException {
        FileReader fr = new FileReader("/my_file.txt"); // jvm handle this beacuse
        System.out.println("m2 end"); // not come
    }
}
