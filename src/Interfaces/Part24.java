package Interfaces;

//Deep cloning
public class Part24 {
    public static void main(String[] args) throws Exception{

        Coourse c1=new Coourse(2001,"Algorithm");

        Sttudent s1=new Sttudent(101,"Rahim",3.66f,c1);
        System.out.println(s1.hashCode() +" :: "+s1);


        Sttudent s2= (Sttudent) s1.clone();
        s2.setId(2002);

        s1.getCoourse().setCoourseName("MI/AI");
        s1.getCoourse().setCoourseId(2004);
        System.out.println(s2.hashCode()+"::"+s2);
        System.out.println(s1.hashCode() +" :: "+s1);




    }
}

class Sttudent implements Cloneable{
    private int id;
    private String name;
    private float cgpa;
    private Coourse coourse;

    public Sttudent(int id, String name, float cgpa, Coourse coourse) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
        this.coourse=coourse;
    }
    public Sttudent(Sttudent s){
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

    public Coourse getCoourse() {
        return coourse;
    }

    public void setCoourse(Coourse coourse) {
        this.coourse = coourse;
    }
    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Sttudent student=(Sttudent) super.clone();
        student.setCoourse((Coourse) coourse.clone());
        return student; // change made here in this method
    }

    @Override
    public String toString() {
        return "Sstudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cgpa=" + cgpa +
                ", coourse=" + coourse +
                '}';
    }


}

class Coourse implements Cloneable{
    private int coourseId;
    private String coourseName;

    public Coourse(int coourseId, String coourseName) {
        this.coourseId = coourseId;
        this.coourseName = coourseName;
    }

    public int getCoourseId() {
        return coourseId;
    }

    public void setCoourseId(int coourseId) {
        this.coourseId = coourseId;
    }

    public String getCourseName() {
        return coourseName;
    }

    public void setCoourseName(String coourseName) {
        this.coourseName = coourseName;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Coourse{" +
                "coourseId=" + coourseId +
                ", coourseName='" + coourseName + '\'' +
                '}';
    }
}
