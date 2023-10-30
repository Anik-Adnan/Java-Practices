package test;

public class Test02 {
    public static void main(String[] args) {
        String s1="abc";
        String s2="def";
        String s3=s2;
        s2="ghi";
        System.out.println(s1+s2+s3);
    }
}
