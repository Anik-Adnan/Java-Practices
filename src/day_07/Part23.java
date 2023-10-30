package day_07;
//slaw cloning
public class Part23 {
    public static void main(String[] args) throws Exception{
        Course c1=new Course(2001,"Algorithm");


        Sstudent s1=new Sstudent(101,"Rahim",3.66f,c1);
        System.out.println(s1.hashCode() +" :: "+s1);

//        c1.setCourseName("C programming");

        Sstudent s2= (Sstudent) s1.clone();
        s2.setId(2002);

        s1.getCourse().setCourseName("MI/AI");
        s1.getCourse().setCourseId(2004);
        System.out.println(s2.hashCode()+"::"+s2);
        System.out.println(s1.hashCode() +" :: "+s1);




    }
}

class Sstudent implements Cloneable{
    private int id;
    private String name;
    private float cgpa;
    private Course course;

    public Sstudent(int id, String name, float cgpa, Course course) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
        this.course=course;
    }
    public Sstudent(Sstudent s){
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

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Sstudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cgpa=" + cgpa +
                ", course=" + course +
                '}';
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }
}

class Course{
    private int courseId;
    private String courseName;

    public Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
