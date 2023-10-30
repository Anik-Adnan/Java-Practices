package test;
/*
    singleton design pattern make only one object
    default constructor hole,differrent package a kaj korbe na
 */
public class SingletonDesign {
    private static SingletonDesign obj=null;
    protected SingletonDesign(){
        //if constructor is protected , then extends singleton class with other package's main class
    }
    public static SingletonDesign getInstance(){
        if(obj==null){
            obj=new SingletonDesign();
        }
        return obj;
    }
    public  String sayHello(){
        return "Hello!!"+" This is Singleton Design Pattern.";
    }
}
