package day_07_enum;

public class Enum2 {
    public static void main(String[] args) {
        DayOfWeek dd=DayOfWeek.MONDAY;
        int value= dd.getValue();
        System.out.println("Day name : "+dd.name() +" and value is : "+dd.ordinal());

        DayOfWeek[] d=DayOfWeek.values();
        for (DayOfWeek D :
                d) {
            System.out.println("Day: "+D.getName()+"   value: "+D.getValue());
        }

    }
}

enum DayOfWeek{
    MONDAY("Monday",1),TUESDAY("Tuesday",2),WEDNESDAY("Wednesday",3),THURSDAY("Thursady",4),FRIDAY("Friday",5),SATURDAY("Saturday" ,6),SUNDAY("Sunday",7);
    private final int value;
    private final String name;

    private DayOfWeek(String name,int value){
        this.name=name;
        this.value=value;
    }
    public int getValue(){
        return this.value;
    }
    public String getName(){
        return this.name;
    }

}
