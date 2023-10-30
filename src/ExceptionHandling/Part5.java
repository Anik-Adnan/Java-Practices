package ExceptionHandling;

import test.A;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Part5 {
    public static void main(String[] args) {
        // multi catch block
        // child ,parent relationship is not allowed
        try {
            String s =null;
            System.out.println(s.length());
            new FileReader(""); // checked exception // handle exception in compile time
        }catch (ArithmeticException | FileNotFoundException | NullPointerException e){
            if ( e instanceof ArithmeticException){
                // alter nate code
            }
            else if ( e instanceof FileNotFoundException){
                // alternate code
            }
            else if( e instanceof NullPointerException){
                // alternate code for Null pointer exception
            }
        }

    }
}
