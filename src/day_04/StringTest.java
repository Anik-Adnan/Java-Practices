package day_04;

public class StringTest {
    public static void main(String[] args) {
        // in java there is no operator overloading,but + in string is different case
        // in string + operator use like (operator overloading) only in string  concatenation

        //if use +  internaly StringBuilder or StirngBuffer
        System.out.println(10+20+"Anik"+10+20); //30Anik1020
        StringBuilder sb=new StringBuilder();
        sb.append(10);
        sb.append(20);
        sb.append("Anik");
        sb.append(10);
        sb.append(20);
        System.out.println(sb);

        String s="Hello World"; // hold memory SCP
        String s1="Anik"; // SCP
        String s2="Anik"; //SCP
        String s3=new String("Anik");
        // new keyword At first create 2 object 1.Heap and 2.SCP
        System.out.println(s1);
        System.out.println(s2==s1); //true
        System.out.println(s2==s3); //false
        System.out.println(s2==s3.intern()); // now true

        char[] c={'a','n','i','k'};
        String ss;

        System.out.println(String.copyValueOf(c,1,3));
        System.out.println(String.valueOf(c,1,3));

        String templete="hello %s,How are you? are you %d years old?";
        String p1=String.format(templete,"Anik",22);
        String p2=String.format(templete,"Munna",23);
        String p3=String.format(templete,"Farhad",21);

        System.out.println(p2 );


    }
}
