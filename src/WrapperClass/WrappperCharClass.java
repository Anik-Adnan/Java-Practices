package WrapperClass;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class WrappperCharClass {
    public static void main(String[] args) {
        Character c= new Character('A');

        // code pointer means asciii char int value
        System.out.println(Character.getType(c)); // getType(take char or int) represent, what type of character it is
        System.out.println(Character.getType(48));
        System.out.println(Character.getName(c)); // getName() represents code pointer name
        System.out.println(Character.getName('&'));
        System.out.println(Character.isJavaIdentifierPart('#')); // #var is not a valid identifier
        System.out.println(Character.isJavaIdentifierPart(65)); //

        System.out.println(Character.digit('F',16)); // hexa "F"  decimal value is 15 // char to desimal
        System.out.println(Character.forDigit(11,16)); // decimal to char
        System.out.println(Character.isMirrored( '('));  // mirror chars ({[<>]})
        System.out.println(Character.codePointBefore("Anik",1)); // before N, "A" == 65
        System.out.println(Character.codePointCount( "AnikAdnan",2,6)); // range 4
//        System.out.println(Character.codePointOf()); // n == 110

        System.out.println((int) '\u0000' + " to " + (int) '\u007f');// Byte 1 : 0xxxxxxx == 2^7
        System.out.println((int) '\u0080' + " to " + (int) '\u07ff'); // Byte 1: 110xxxxx Byte 2: 10xxxxxx == 2^11
        System.out.println((int) '\u0800' + " to " + (int) '\u7fff'); // Byte 1: 1110xxxx Byte 2: 10xxxxxx    Byte 3: 10xxxxxx == 2^16
        System.out.println(0x1000 + " to " +  0x10ffff); // Byte 1: 11110xxx Byte 2: 10xxxxxx    Byte 3: 10xxxxxx Byte 4: 10xxxxxx== 2^21
        System.out.println(	0x1F600); // 0x1F600 emoji code point 128512
        System.out.println(Character.charCount(128512)); //  imogi takes 2 character
        // two code point BMP, SMP
         // 0 to 65536 range character called  Basic Multilingual Plane (BMP) // need 1 char
        // >65536 range char called  Supplementary Multilingual Plane (SMP) // atleast need 2 chars // one is highsargateCode point ,or one is low sarrogate codePoint
        System.out.println(Character.isSupplementaryCodePoint(65535)); // false
        System.out.println(Character.isBmpCodePoint(65537)); // false

        char[] chrs=Character.toChars(128512);
        System.out.println(Character.isHighSurrogate(chrs[0])+ "  " + Character.isLowSurrogate(chrs[1]));

        System.out.println(chrs);
        System.out.println(new String(chrs));
        System.out.println(new String(Character.toChars(0x1F600)));

        int start=128512;
        int end=128600;
        for(int i=start; i<=end;i++){
            char[] ch=Character.toChars(i);
            System.out.println(new String(ch) +"  =  "  +Character.getName(i));
        }
        System.out.println(Character.isDefined(128600)); // defined "true"
        System.out.println(Integer.toBinaryString(127));

        System.out.println((char) 1000);
        byte[] bytes="Ϩ".getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(bytes));
        System.out.println(Integer.toBinaryString(bytes[0])+"  "+ Integer.toBinaryString(bytes[1]));
//        11111111111111111111111 _1110_01111 111111111111111111111111_ 10_101000
        // 110xxxxx 10xxxxxxxx == 01111101000== 1000





    }
}
