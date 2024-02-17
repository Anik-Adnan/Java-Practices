package WrapperClass;

public class Casting {

    public static void main(String[] args) {
        // Byte     => 1 Byte
        // available 7 bits ,1 bit is MSB=Sign bit, one is 0
        //by deafult always java numeric value is integer, that's why we need casting

        Byte b=new Byte((byte) 327);  // explicit casting
        Short s= new Short((short) 34); // explicit casting
        Integer i=new Integer(354); // emplicit casting, defult is int always

        Long l=new Long(34646L); //emplicit casting
        Long l2=new Long("34646L");

        Float f=new Float(354.65f); //emplicit casting
        Float f2=new Float(13216546d);
        Float f3=new Float("13216546d");
        System.out.println(f3);


        Boolean bl=new Boolean("TrUe"); // print True // not case sensesitive, if true, true,otherwise false
        Boolean bl2=new Boolean(false);

        Character c1=new Character('a');



        long x=326461364641l;
        float a=x; // emplicit casting
        // 10000000 float will take it, 10^7= only 4  bits taken


        System.out.println(Byte.MAX_VALUE); // 2^7 -1 = 127
        System.out.println(Byte.MIN_VALUE); // 2^8 = -128

        System.out.println(Integer.toBinaryString(327)); // ... 10 1000111 = 327
        System.out.println(Integer.toBinaryString(71)); //         1000111 = 71  // 7 bits is available
        System.out.println(b); // 71


    }
}
