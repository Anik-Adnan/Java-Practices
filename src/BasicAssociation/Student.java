package BasicAssociation;

import java.util.List;

public class Student {
    public String id;
    public String name;
    public String contact;

    //bi-directional association
    public void supervision(List<Teacher> tchr){
        System.out.println(this.name+" is supervised the following teachers..");
        for (Teacher t : tchr) {
            System.out.println(t.name);
        }
    }

}
