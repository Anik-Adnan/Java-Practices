package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Part8 {
    public static void main(String[] args) {
        m1();
    }

    static void m1(){
        try{
            m2();

        }catch (IOException e){
            System.out.println(e);
        }

    }

    static void m2()throws FileNotFoundException,IOException{
        FileReader fr =new FileReader("t.txt");
    }
}
