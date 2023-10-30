package composition;

import java.util.ArrayList;
import java.util.List;

public class MainProgram {
    public static void main(String[] args) {
        College c1=new College("Bhashani High School and College","Tangail");
        College c2=new College("Islamiya High School and College","Tangail");
        College c3=new College("Aliya Madrasha","Tangail");
        List<College> colleges=new ArrayList<>();
        colleges.add(c1);
        colleges.add(c2);
        colleges.add(c3);
        University u1=new University(colleges);
        for (College c: colleges) {
            System.out.print("College Name : "+c.name);
            System.out.println(" \tAddress : "+c.address);

        }

    }
}
