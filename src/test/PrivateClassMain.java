package test;

import static test.PrivateClass.*;

public class PrivateClassMain {
    public static void main(String[] args) {
        InnerClass innerObj = new InnerClass();
        System.out.println(innerObj.reminder());

    }
}
