package test;

// constructor chaining

public class constructorChaning {
    String name;
    String ID;
    int age;
    String address;
    String email;
    constructorChaning(){

    }

    public constructorChaning(String name) {
        this.name = name;
    }

    public constructorChaning(String name, String ID,int age) {
        this(name);
        this.ID = ID;
        this.age=age;
    }

    public constructorChaning(String name, String ID, int age,String address,String email) {
        this(name,ID,age);
        this.address=address;
        this.email=email;
    }

    @Override
    public String toString() {
        return "constructorChaning{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        constructorChaning c1=new constructorChaning();
        constructorChaning c2=new constructorChaning("Anik");
        constructorChaning c3=new constructorChaning("Adnan","IT-20021",23);
        constructorChaning c4=new constructorChaning("Anik Adnan","IT-20021",23,"Tangail","anikadnanict17@gmail.com");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

    }
}
