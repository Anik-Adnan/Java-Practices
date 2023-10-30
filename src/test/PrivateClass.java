package test;
//when we don' need to create any object through new keyword
// but with the help inner class , we can make it
public class PrivateClass {
    public String name;
    private PrivateClass(String name){
        this.name=name;
    }

    String say(){
        return "Hello!! ";
    }
    public  static class InnerClass{
         String reminder(){
            PrivateClass v = new PrivateClass("Anik Adnan");
            return v.say()+v.name+". How are u??";
        }
    }


}
