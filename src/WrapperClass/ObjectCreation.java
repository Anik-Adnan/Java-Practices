package WrapperClass;
//    in java we are able to create wrapper object
//    in two ways.
//            a) By using constructor approach
//              b) By using valueOf() method
// casting class was constructor approach

// valueOf() method ia a type of method, return same or different type object

public class ObjectCreation {
    public static ObjectCreation getInstance(){
        return new ObjectCreation(); // ObjectCreation class return same type object
    }
    public static A getA(){
        return new A(); // ObjectCreation class return different type object
    }

    public static void main(String[] args) {
        ObjectCreation a = ObjectCreation.getInstance();
        A aa= ObjectCreation.getA(); // getA() method return new object
        A bb= ObjectCreation.getA(); // getA() method return new object

        System.out.println("Point different location : " + (aa==bb));
        // cause new keyword present in getA() method in return
        System.out.println(aa);
        System.out.println(bb);

        //point same location, without new keyword ,if both are ture or false
        Boolean b = Boolean.valueOf("TrUe"); // not case sensetive
        Boolean b2=Boolean.valueOf((boolean) true);
        System.out.println("Point same location: "+(b==b2));

        Boolean b3=Boolean.valueOf(Boolean.FALSE);
        System.out.println("Point diff. location: "+(b==b3));

        Integer i=new Integer(128);
        // Integer i2=128 both are same compiler change it with factory method
        Integer i2=Integer.valueOf(128);
        // valueOf() return from cache always
        // Integer cache[]=[ new Integer(-128),new Integer(-127),....,0,....100,....,new Integer(127)] ? new Integer();

        System.out.println("128==128 : "+(i==i2));




    }

}
class A{

}
