package Aggregation;
/*
Aggregation is weak bonding
 */

public class Employee {
    public String name;
    public int id;
    Address Addresses; // Aggregation (entity reference of Address class)
    public Employee(String name,int id,Address Addresses){
        this.name=name;
        this.id=id;
        this.Addresses=Addresses;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", City=" + Addresses.city +
                ", State=" + Addresses.state +
                ", Country=" + Addresses.country +
                '}';
    }
}
