package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Part9 {
    public static void main(String[] args) {
        A a =new B();
        try{
            a.fun();
        }catch (IOException e){
            System.out.println(e);
        }


    }
}

class A{
    void fun() throws IOException { // parent or
        System.out.println("fun of A class");
    }
}
class B extends A{
    // if chile class faced checked exception,
    // then we have to provide in parent class ,
    // same type or parent type exception
    // if we provide reverse then in run time it will show an exception
    @Override
    void fun() throws FileNotFoundException { // if we taek Exception that will be an error
        FileReader fr =new FileReader("t.txt");
        System.out.println("fun of B class");
    }
}
