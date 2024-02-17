package StringManipulation;

import java.util.ArrayList;
import java.util.List;

public class StringTest2 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8};
        String s="";
        for (int i=0;i<a.length;i++){
            s+=(i+",");
        }
        System.out.println(s);

        List<String> sa=new ArrayList<>();
        List<String> sa2=new ArrayList<>();
        for(int j: a){
            sa.add(String.valueOf(j));
        }
        for (int i=0;i<a.length;i=i+2){
            sa2.add(String.valueOf(a[i]+""+a[i+1]));
        }
        System.out.println(String.join(",",sa));
        System.out.println(String.join("-",sa2));

        //toCharArray() method
        String ss="i Am Anik Adnan";
        char[] cc=ss.toCharArray();

        for (char c : ss.toCharArray()) {
            System.out.println(c);
        }

    }
}
