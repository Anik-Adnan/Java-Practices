package CollectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetExample04 {
    public static void main(String[] args) {
        HashSet<Student> hashSet=new HashSet<>();

        Student s1=new Student("101","Anik","3.76");
        Student s2=new Student("102","Adnan","3.86");
        Student s3=new Student("103","Biswas","3.66");
        // duplicate object, Hashset hold this object,beacuse hash set duplication checkout by value not object
        // but we can prevent this kind of situation
        // by suing liked hash set or override the hasCode() and equals() methods by ID
        Student s4=new Student("101","Anik","3.76");

        hashSet.add(s1);
        hashSet.add(s2);
        hashSet.add(s3);
        hashSet.add(s4);

//        System.out.println(hashSet);
        System.out.println("HashSet:");
        for (Student student : hashSet) {
            System.out.println(student);
        }

        // Using LinkedHashSet
        LinkedHashSet<Student> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(new Student("123","Alice",  "3.8"));
        linkedHashSet.add(new Student("456", "Bob", "3.5"));
        linkedHashSet.add(new Student("123","Alice",  "3.8")); // Duplicate entry

        System.out.println("\nLinkedHashSet:");
        for (Student student : linkedHashSet) {
            System.out.println(student);
        }


    }
}

class Student{
    String name,ID,Cgpa;

    public Student(String ID,String name, String cgpa) {
        this.name = name;
        this.ID = ID;
        Cgpa = cgpa;
    }


    /*
    @Override
    public boolean equals(Object o) {
        // Check if the references are the same
        if (this == o) return true;

        // Check if the object being compared is null or is not an instance of the same class
        if (o == null || getClass() != o.getClass()) return false;

        // Cast the object being compared to Student type
        Student student = (Student) o;

        // Check if the attributes of both objects are equal using Objects.equals()
        return Objects.equals(name, student.name) && Objects.equals(ID, student.ID) && Objects.equals(Cgpa, student.Cgpa);
    }


    @Override
    public int hashCode() {
        // Generate hash code using Objects.hash()
        return Objects.hash(name, ID, Cgpa);
    }

     */

    @Override
    public int hashCode(){
       return Integer.parseInt(this.ID);
    }
    @Override
    public  boolean equals(Object o){
        return this.ID ==((Student) o).ID;
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public String getCgpa() {
        return Cgpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", Cgpa='" + Cgpa + '\'' +
                '}';
    }
}
