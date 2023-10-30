package test;

// final class making , no setter method, only getter method
public final class Person {
    private final  String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public int getAge() {
        return age;
    }

//    public void setAge(int age) {
//        this.age = age;
//    }

    public static void main(String[] args) {
        Person p1=new Person("anik",20);
//        p1.setName("Adnan");
//        p1.setAge(24);
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println();

    }
}
