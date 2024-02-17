package Enumeration;


/// purpose for constant define for typeSafety
/*

 */
public class Enum1 {
    public static void main(String[] args) {



        System.out.println(Direction.TOP);
        System.out.println(Direction.TOP.name());
        System.out.println(Direction.TOP.ordinal());
//        public static day_07_enum.Direction[] values(); // compiler provide his
        System.out.println(Direction.values());
        Direction[] directions=Direction.values();
        for (Direction d:
             directions) {
            System.out.println(d.name()+" "+d.ordinal() );
        }
        Direction.TOP.fun();
        Direction.BOTTOM.fun();

    }
}
enum Direction implements Intf { //final class day_07_enum.Direction extends java.lang.Enum<day_07_enum.Direction>
    // top,bottom, ... all are Direction type refernce
    //public static final // public static final day_07_enum.Direction TOP;
//    TOP,BOTTOM,LEFT,RIGHT;

    TOP{
        @Override
        public void interffaceFun() {

        }

        @Override
        public void fun() {
            System.out.println("absatrct TOP method implementation");
            }
        }, BOTTOM{
        @Override
        public void interffaceFun() {

        }

        @Override
        public void fun() {
            System.out.println("absatrct BTTOM method implementation");
        }
    }, RIGHT{
        @Override
        public void interffaceFun() {

        }

        @Override
        public void fun() {
            System.out.println("absatrct RIGhHT method implementation");
        }
    }, LEFT{
        @Override
        public void interffaceFun() {

        }

        @Override
        public void fun() {
            System.out.println("absatrct LEFT method implementation");
        }
    };

//    static {
//        TOP=new Direction(){
//            @Override
//            public void fun() {
//                System.out.println("abs implementation");
//            }
//        };
//    }



    Direction(){
        //contructor by default private// outside cannot create object
        //inside we create constructor
        System.out.println("called");
    }
    public abstract void fun();


}

interface Intf{
    void interffaceFun();
}