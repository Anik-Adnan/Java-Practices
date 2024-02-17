package WrapperClass;

//1 byte = 8 bite
// 0/1 0000000 == 0
// 0/1 1111111 == 64+32+16+8+4+2+1 == 127
// negative value 2's complement kore rakhe

// -128 =  1000 0000
// 1's  =  0111 1111
//2's   =         +1
//       ------------
//finally= 1000 0000 == -128
// possible to represent by 8 bits

public class WrapperByteClass {
    public static void main(String[] args) {
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.BYTES); // return how many bytes
        System.out.println(Byte.SIZE); // return how many bits
        System.out.println(Byte.TYPE); // type

        // methods
        // toUnSignedInt() ignore sign bit
        // sign bits used for value representation
        System.out.println(Byte.toUnsignedInt((byte)-5));
        // 5   = 00000101
        //1's  = 11111010
        // 2's =       +1
        //-----------------
        //     = 11111011 == 251

        byte b=34; // if  -128> byte value >127 compiler show  error
        //Byte bb=Byte.valueOf("128"); // error: Value out of range. Value:"128" Radix:10


        // valueOf() convert primitive to class type
        Byte b2=b; // auto boxing ( compiler covert it, Byte b2=Byte.valueOf(b);)

        Byte b3=new  Byte((byte)15);
        byte b4=b3; // auto out-boxing ( compiler covert it, byte b4=b3.byteValue(); )

        System.out.println(Byte.valueOf("10",8)); // 10 octal value = 8

        int decimal=10;
        int ocal= 010;
        int hexa= 0xaf;
//        System.out.println(decimal==ocal); // false

        // parseByte() convert class type to byte primitive type
        System.out.println(Byte.parseByte("10",2));
        //  compare() just subtraction
        System.out.println(Byte.compare((byte)20,(byte) 15));

        //decode() -> always need prefix e.s 0,0x
        Byte d=Byte.decode("0xf");
        System.out.println("decode 0xf : "+d);

        System.out.println(Byte.hashCode((byte)15)); // return int value

//        before all are static , all are callled by class name

        // non-static methods
        Byte x=50;
        int i=x.intValue();
        float f=x.floatValue();
        long l= x.longValue();
        double dd=x.doubleValue();
        int aa=x.compareTo((byte)40);



    }
}
