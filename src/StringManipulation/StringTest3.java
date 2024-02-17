package StringManipulation;

public class StringTest3 {
    public static void main(String[] args) {
        String s="hello";
        String s2=s+"bro"; // create StringBuilder internaly, for using + or concat()
        System.out.println(s2);

        //internaly jvm call StringBuilder
        StringBuilder sb =new StringBuilder();
        sb.append(s);
        sb.append("bro");
        String ss=sb.toString();
        //using StringBuilder is best,rather than using more + or cancat method

        System.out.println(ss);
    }
}
