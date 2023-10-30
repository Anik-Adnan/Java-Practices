package test;

public class Student {
    private String name;
    private int ID;
    private double CGpa;
    /* all are user -define constructor */
    public Student(){}
    // parameterized constructoctor

    public Student(String name, int ID, double CGpa) {
        this.name = name;
        this.ID = ID;
        this.CGpa = CGpa;
    }
    //copy constructor
    public Student(Student student) {
        this.name = student.name;
        this.ID = student.ID;
        this.CGpa = student.CGpa;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getCGpa() {
        return CGpa;
    }

    public void setCGpa(double CGpa) {
        this.CGpa = CGpa;
    }

    @Override
    public String toString() {
        return "test.Student{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", CGpa=" + CGpa +
                '}';
    }

    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("Anik Adnan");
        s1.setID(21);
        s1.setCGpa(3.51);
        System.out.println(s1);

        s1.setName("Biswas"); // name updated
        System.out.println(s1);

        Student s3=new Student();
        System.out.println(s3);

    }
}
