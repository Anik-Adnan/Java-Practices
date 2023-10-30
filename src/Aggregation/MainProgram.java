package Aggregation;

public class MainProgram {
    public static void main(String[] args) {
        Address ad1=new Address("Meherpur","Khulna","Bangladesh");
        Employee e1=new Employee("Anik Adnan",2201,ad1);
        System.out.println(e1);
        System.out.println(ad1);
    }
}
