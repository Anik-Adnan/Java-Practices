package StringManipulation;

public class StringTest4 {
    public static void main(String[] args) {
        //Regex = Regular Expression
        String s="anik6adnan78aminan@gmail.com@hello"; //0-9
        String s2=s.replaceAll("\\d"," ");
        String s3=s.replaceAll("@"," ");
        String s4=s.replaceFirst("@"," ");

        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        String s5= s.substring(5,10);
        String s6=(String) s.subSequence(5,10);

        System.out.println(s5);
        System.out.println(s6);

        String ss1="Anik";
        String ss2="Adnan";
        System.out.println(ss2==ss1); //false

        String ss3=new String("Anik");
        System.out.println(ss3 instanceof String); //true
        //first check type "true" then char by char check with equals()
        System.out.println(ss2.equals(ss3)); //false

        StringBuilder sb= new StringBuilder();
        sb.append("Anik");
        System.out.println(ss1.contentEquals(sb)); //True

        System.out.println("code point at 0"+ss1.codePointAt(0)); //print asscii value
        String sss="i am Aik Adnan. How Are You?";
        String[] sp=sss.split(" ");
        for (String x:sp){
            System.out.println(x);
        }

        String z="hello how are you, hello man";
        String z2="how are you";
        System.out.println(z.regionMatches(6,z2,0,z2.length())); //matched

    }
}
