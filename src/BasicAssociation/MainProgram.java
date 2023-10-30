package BasicAssociation;

import java.util.ArrayList;
import java.util.List;

public class MainProgram {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Anik";
        Student s2=new Student();
        s2.name="Aadnan";
        Student s3=new Student();
        s3.name="Ahad";

        List<Student> studentgroup1=new ArrayList<>();
        studentgroup1.add(s1);
        studentgroup1.add(s2);
        studentgroup1.add(s3);

        Teacher t=new Teacher();
        t.name="Tanvir Rahman";
        t.Teach(studentgroup1); // uni-direectional
        t.supervision(studentgroup1); // by-directional association


        Teacher t1=new Teacher();
        t1.name="Tarvir Rahman";
        Teacher t2=new Teacher();
        t2.name="Shamim Mahmud";
        Teacher t3=new Teacher();
        t3.name="Ahosan Habib Tarek";

        List<Teacher> teacherGroup1=new ArrayList<>();
        teacherGroup1.add(t1);
        teacherGroup1.add(t2);
        teacherGroup1.add(t3);

        s1.supervision(teacherGroup1);



    }
}
