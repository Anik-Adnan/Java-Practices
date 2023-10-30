package day_8_9_10_examPreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HasRelation {
    public static void main(String[] args) {
        /*
        is-A relation
        has-A relation

        one to one
        one to many
        many to many

        Association
            1. Aggregation (independend (one object exit without another object), not destroyed,reusable,lossly, life cycle different
                *unidirection
                *bidrection
            2. Composition ( strong type of association,not independent, )

         */
        Student s1=new Student();
        Course c1=new Course(101,"C programing");
        s1.setCourse(c1); // 1 student get 1 course
        Student s2=new Student();
        Course c2=new Course(102,"C++");
        s2.setCourse(c2);

        s2.setCourses(Arrays.asList(c1,c2)); // 1 student get many courses
        System.out.println(s2.getCourses());
        System.out.println(s2.getCourses().get(0).name);


        //Aggregation
        //2nd year
        Course c3=new Course(201,"java");
        Course c4=new Course(202,"algorithm");
        //3rd year
        Course c5=new Course(301,"Operating System");
        Course c6=new Course(302,"Data Mining");

        Student s3=new Student(20030,"Noor",Arrays.asList(c3,c4));
        System.out.println(s3); // 2nd year courses
        Student s4=new Student(20030,"Noor",Arrays.asList(c5,c6));
        System.out.println(s4); // same operson 3rd year course



    }
}
class Course{
    int cid;
    String name;

//    Student student; // bidirection
//    List<Student> students; // many to many // list of students and courses

    public Course(){}

    @Override
    public String toString() {
        return "Course{" +
                "cid=" + cid +
                ", name='" + name + '\'' +
                '}';
    }

    public Course(int cid, String name) {
        this.cid = cid;
        this.name = name;
    }

}
class Student{
    int sid;
    String name;
    Course course; // one to one relation  // unidirection
    List<Course> courses; // one to many relation

    public Student() {
    }


    public Student(int sid, String name, List<Course> courses) {
        this.sid = sid;
        this.name = name;
        this.courses = courses;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                ", course=" + course +
                ", courses=" + courses +
                '}';
    }
}

