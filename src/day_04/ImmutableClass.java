package day_04;


public final class ImmutableClass {
    private final int id;
    private final String name;
    private final float cgpa;

    public ImmutableClass(int id, String name, float cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getCgpa() {
        return cgpa;
    }

    @Override
    public String toString() {
        return "ImmutableClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }



    public static void main(String[] args) {
        ImmutableClass student1=new ImmutableClass(20021,"Anik",3.51f);
        ImmutableClass student2=new ImmutableClass(20022,"Anik",3.65f);
        //string name="Anik" same for student1 and student2 in SCP
        // jvm doesn't create another memory for name
        // string name same but point same memory in SCP
        // but String is immutable thats why another object  name does not same,hold another memory in SCP
        System.out.println(student1);
        System.out.println(student2);
    }
}
