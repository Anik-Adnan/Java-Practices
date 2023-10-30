package day_8_9_10_examPreparation;

import java.time.chrono.HijrahEra;

public class HasARelation2 {
    public static void main(String[] args) {
        /*
        aggregation
        Heart heart=new Heart("love");
        Human human=new Human("Anik",null);
        */

        Human human=new Human("Anik adnan");
//        System.out.println(human.getHeart());

//        human=null;
//        System.out.println(human.getHeart()); //nullPointerException //human=null;

//        Heart heart=human.getHeart();
//        human=null;
//        System.out.println(heart);

        human.printLove();


    }
}
class Heart{
    String love;

    public Heart(String love) {
        this.love = love;
    }

    @Override
    public String toString() {
        return "Heart{" +
                "love='" + love + '\'' +
                '}';
    }
}
class Human{
    String name;

    /* aggregation
    private  Heart heart;

    public Human(String name,Heart heart) {
        this.heart = heart;
        this.name=name;
    }
     */
    //now composition
    private final Heart heart;

    public Human(String name) {
        this.name = name;
        this.heart=new Heart("Love **");
    }

//    public Heart getHeart() {
//        return heart; //remove getMethod
//    }

    //just simply
    void printLove(){
        System.out.println(heart.love);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", heart=" + heart +
                '}';
    }
}
