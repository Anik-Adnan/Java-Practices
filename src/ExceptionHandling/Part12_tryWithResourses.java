package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Part12_tryWithResourses {
//    static FileInputStream fi;
//    static Scanner sc;

    static void Divide() throws IOException {
//        fi=new FileInputStream("J:\\##CP\\java_codes\\Test\\src\\ExceptionHandling\\text.txt");
        try (FileInputStream fi=new FileInputStream("J:\\##CP\\java_codes\\Test\\src\\ExceptionHandling\\text.txt"); Scanner sc =new Scanner(fi)){
//            sc=new Scanner(fi);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(a / b);
        }
//        finally {
//            fi.close();
//            sc.close(); //if this line commented return a exception
//
//        }


    }
    public static void main(String[] args) throws IOException {
        try{
            Divide();
        }catch (Exception e){
            System.out.println(e);
        }
//        int x=sc.nextInt();
//        System.out.println(x);
    }
}
