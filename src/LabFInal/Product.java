package LabFInal;

 class Product {
     public String Name;
     private int ID;
     public String Type;
     public double price;
     public String Quality ;

     public Product(String name, int ID, String type, double price, String quality) {
         Name = name;
         this.ID = ID;
         Type = type;
         this.price = price;
         Quality = quality;
     }
 }
