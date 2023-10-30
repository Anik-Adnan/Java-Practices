package LabFInal;

import Inheritance.Human;

import java.util.HashMap;

class ShopKeeper extends Human {
    public String Name;
    public int ID;
    public String Phone_Number;

    public ShopKeeper(String name, int ID, String phone_Number) {
        Name = name;
        this.ID = ID;
        Phone_Number = phone_Number;
    }
}
