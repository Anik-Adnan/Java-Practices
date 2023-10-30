package Inheritance;

public class Human {
    public  String Name;
    public int Age;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                '}';
    }
}
