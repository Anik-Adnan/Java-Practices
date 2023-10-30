package day_8_9_10_examPreparation;

public class AggreagtionExample01 {
    public static void main(String[] args) {
        Address address = new Address("123 Main St", "Anytown", "CA");
        Person person = new Person("John Smith", address);

        System.out.println("Name: " + person.getName());
        System.out.println("Address: " + person.getAddress().getStreet() + ", " + person.getAddress().getCity() + ", " + person.getAddress().getState());

    }
}

class Address {
    private String street;
    private String city;
    private String state;

    public Address(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }
}

class Person {
    private String name;
    private Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
}

