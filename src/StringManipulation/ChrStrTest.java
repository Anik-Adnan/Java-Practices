package StringManipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChrStrTest {
    public static void main(String[] args) {
        String s1="ANik ";
        String s2=new String("   Adnan   ");
        String s3=new String(s2);

        char[] c=new char[]{'A','n','i','k'};
        char[] c2=new char[10];
        c[0]='a';

        System.out.println((char)65);
        System.out.println((int)'A');
        System.out.println(Integer.toBinaryString(97));

        byte[] bytes= s1.getBytes();
        System.out.println(Arrays.toString(bytes));
        String s4="anikadnanict17@gmail.com@anik@asif";
        String[] s5= s4.split("@",2);
        List<String> l=new ArrayList<>();
        for (String ss :
                s5) {
            l.add(ss);
            System.out.println(ss);
        }
        System.out.println(l);






    }
}
