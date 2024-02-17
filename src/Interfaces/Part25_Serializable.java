package Interfaces;

import java.io.*;

public class Part25_Serializable {
    public static void main(String[] args) throws Exception {
       /*
        Studentt s1=new Studentt(1001,"Anik adnan",3.62f);

        OutputStream os=new FileOutputStream("E:/##CP/java_codes/Stuentt.txt");
        ObjectOutput objectOutput=new ObjectOutputStream(os);
        objectOutput.writeObject(s1);

        */

        InputStream in=new FileInputStream("E:/##CP/java_codes/Stuentt.txt");
        ObjectInput objectInput=new ObjectInputStream(in);
        Studentt s= (Studentt) objectInput.readObject();
        System.out.println(s);





    }
}



class Studentt implements Serializable{
    private int id;
    private String name;
    private float cgpa;

    public Studentt(int id, String name, float cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
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

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "Studentt{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cgpa=" + cgpa +
                 '}';
    }
}
