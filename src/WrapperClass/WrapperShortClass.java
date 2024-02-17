package WrapperClass;

public class WrapperShortClass {
    public static void main(String[] args) {
        //all static methods are same as byte
        System.out.println(Short.MAX_VALUE); // 32767
        System.out.println(Short.MIN_VALUE); //-32768
        System.out.println(Short.BYTES); // 2
        System.out.println(Short.SIZE); // 16
        System.out.println(Short.TYPE); // short
        System.out.println("--------------------");

        System.out.println(Short.reverseBytes((short) 10)); // 2560
        // 10 = 00000000 00001010 // reverse by byte
        //      00001010 00000000 == 2560
        System.out.println(Short.compare((short) 15,(short) 25));




    }
}
