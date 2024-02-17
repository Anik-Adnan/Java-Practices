package WrapperClass;

import java.util.Properties;

public class WrapperIntegerClass {
    public static void main(String[] args) {
        int a=400;
        Integer b=400; //create new object, greater cache range 127
        Integer c=400;

        System.out.println(a==b); // true
        // compiler a == b.intValue()
        System.out.println(b==c); // false , both are diff. object
        System.out.println(b.equals("str")); // false , not same type

//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.BYTES);
//        System.out.println(Integer.SIZE);
//        System.out.println(Integer.TYPE);

        System.out.println(Integer.bitCount(7)); // 7 == 111 count set bit
//        System.out.println(Integer.max(10,50));
//        System.out.println(Integer.min(10,50));
//        System.out.println(Integer.sum(10,50));

        System.out.println(Integer.reverseBytes(10));
        System.out.println(Integer.reverse(10));

//        System.out.println(Integer.toBinaryString(5));
//        System.out.println(Integer.toHexString(15));
//        System.out.println(Integer.toOctalString(10));
        System.out.println(Integer.numberOfLeadingZeros(15)); // count before zeros
        System.out.println(Integer.numberOfTrailingZeros(15)); //count after zeros
        System.out.println(Integer.lowestOneBit(12)); // 12 == 1100 // 4
        System.out.println(Integer.highestOneBit(12));// 12

        System.out.println(Integer.rotateLeft(10,2)); // left bit ,right transfer
        // 10 = 000....... 1010 = 0000 ... 1010 00 == 40
        System.out.println(Integer.rotateRight(10,2));// right bit ,left transfer
        // 10 = 000 .... 1010 == 10 0000 ...0010 = negative value,first bit minus

//        System.out.println(Integer.compare(10,20)); //return -1, 0,1
//        Integer x=10;
//        System.out.println(x.compareTo(5));

        // *** important
        Properties p=System.getProperties();
        System.out.println(p);
        System.setProperty("int_value","1000");
        System.out.println(Integer.getInteger("int_value",40));

        System.out.println(Integer.divideUnsigned(-10,2));
         int v= (int) (Integer.toUnsignedLong(-10)/ Integer.toUnsignedLong(2));
        System.out.println(v);

        System.out.println(Integer.remainderUnsigned(11,3));
        int r= (int) (Integer.toUnsignedLong(11)% Integer.toUnsignedLong(3));
        System.out.println(r);

//        System.out.println(Integer.signum(-55)); // if negative -1, positive 1
        Integer z=10;
        System.out.println(z);



    }

}
