package Inheritance;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Human h1=new Student(); // up-casting
        h1.setName("Munna Pervez");
        h1.setAge(23);
        System.out.println(h1);

        Student s1=(Student) h1; // down-casting
        s1.setName("Anik Adnan");
        s1.setAge(22);
        s1.setID("IT-20021");
        System.out.println(s1);

//        List<String> l= new ArrayList<String>();
//        l.add("Anik");
//        l.add("Safayet");
//        l.add("Zarzis");
//        l.add("Tauhid");
//        for (String s : l) {
//            System.out.println(s);
//        }
        Student s2= new Student("Safayet",21,"IT-20005");
        Student s3= new Student("Zarzis",23,"IT-20018");
        Student s4= new Student("Masume",22,"IT-20022");
        Student s5= new Student("Masud Rana",23,"IT-20023");
        List<Student> list=new ArrayList<Student>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        for (Student s :list) {
            System.out.println(s);
            System.out.println("Name  :"+s.getName());
            System.out.println("ID    :"+s.getID());
            System.out.println("Age  :"+s.getAge());
            System.out.println();

        }


    }
}
