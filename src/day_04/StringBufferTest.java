package day_04;

public class StringBufferTest {
    public static void main(String[] args) {
        //thread safe // every method have synchronized modifier
        // slower than StringBuilder
        //mutable class
        // available jdk 0 version(suru theke ace)

        StringBuffer s1=new StringBuffer("anik"); //available with java jdk
        StringBuffer s2=s1.append(" Adnan");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);
    }
}
