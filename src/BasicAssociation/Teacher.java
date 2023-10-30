package BasicAssociation;

import java.util.List;

public class Teacher {
    public String id;
    public String name;
    public String contact;

    //uni-directional association
    public void Teach(List<Student> std){
        System.out.println(this.name+" is teahing the following students..");
        for (Student s : std) {
            System.out.println(s.name);
        }
    }

    public void supervision(List<Student> std){
        System.out.println(this.name+" is supervising the following students..");
        for (Student s : std) {
            System.out.println(s.name);
        }
    }

}
