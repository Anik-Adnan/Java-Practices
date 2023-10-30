package day_07;

//types of interface
//normal interface, Marker interface, funtional interface /SAM(Sinle abstract Method)
// cloning 2 types, slaw cloneing, deep cloning
import java.io.Serializable;

public class Part22 {
    public static void main(String[] args) throws Exception{

        Student s1=new Student(101,"Rahim",3.66f);
        System.out.println(s1);
        Student s2=new Student(s1);
        System.out.println(s2);

        Student s3= (Student) s1.clone();
        //s1 ans s3 both are differnent object,, hashcode() are different
        System.out.println(s1.hashCode() +" :: "+s1);
        System.out.println(s3.hashCode()+"::"+s3);
    }
}

interface NormalInterface{
    void m1();
    void m2();
    // normal interface
}
interface Marker{
    // interface with no method such as; Cloneable,Serialziable
    // they have some power,
}

class student implements Serializable,Cloneable{
    // if we clone a object ,constructor won't be create, but create new object
    //
}

class Student implements Cloneable{
    private int id;
    private String name;
    private float cgpa;

    public Student(int id, String name, float cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    public Student(Student s){
        this.id=s.id;
        this.cgpa=s.cgpa;
        this.name=s.name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCgpa() {
        return cgpa;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }
}