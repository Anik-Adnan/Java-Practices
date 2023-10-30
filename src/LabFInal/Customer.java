package LabFInal;

  class Customer extends human {
      public String Contact_number;
      public String address;
      public int ID;

      public Customer(String name, int age, String gender, String contact_number, String address, int ID) {
          super(name, age, gender);
          Contact_number = contact_number;
          this.address = address;
          this.ID = ID;
      }
  }
