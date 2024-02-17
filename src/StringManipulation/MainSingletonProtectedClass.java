package StringManipulation;


import test.SingletonDesign;

public class MainSingletonProtectedClass extends SingletonDesign {
    public MainSingletonProtectedClass(){
        super(); //protected e super construcor through te access pawya jai
    }
    public static void main(String[] args) {
        //without extends SingletonDesign
//        SingletonDesign obj= SingletonDesign.getInstance();
//        System.out.println(obj.sayHello());
//        System.out.println(obj);

        SingletonDesign mainObj= new MainSingletonProtectedClass();
        System.out.println(mainObj.sayHello());

    }
}
