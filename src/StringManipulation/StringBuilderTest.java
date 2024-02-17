package StringManipulation;

public class StringBuilderTest {
    public static void main(String[] args) {
        // not thread safe
        // available jdk 1.5
        // faster than StringBuffer
        // mutable class
        // stringBuilder capacity increase  = capacity*2+2
        StringBuilder s1=new StringBuilder("Anik");
        StringBuilder s2=s1.append("Adnan");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2); // same object,hold same memory

        StringBuilder x=new StringBuilder();
        x.append("bro");
        x.insert(0,"Hello");
        x.append("Anik");
        x.append("Adnan");
        x.delete(10,14);
        System.out.println(x);

    }
}
