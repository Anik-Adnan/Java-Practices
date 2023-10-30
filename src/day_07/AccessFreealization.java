package day_07;

public class AccessFreealization {
    public static void main(String[] args) {

    }
}
// attempting to assign weaker access privilages
// private -> default -> protected ->public
// we can do decrease accessed but not to do increase access_modifier, it is not possible

class L{
    private void fun(){

    }
    public void display(){
        System.out.println("display ");
    }
}
class OuterCls extends L implements OuterIntface{
    public void method(){
        // only public , we can not take private,protected, default
    }
    protected void fun(){
        // we can take all modifier, fun method class hold private modifier
    }
    public void display(){
        // alwasys public,
    }

}
interface OuterIntface {
    public abstract void method();
}