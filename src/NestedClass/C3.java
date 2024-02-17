package NestedClass;

class AA{
    private int a=11;

    // bridge method or accessor method // don't need bridge method atfer java 11 version
    // used to accessing private fields
    static int getA(AA obj_a){
        return obj_a.a;
    }

//    private char c='A';
//    static char access$000(AA obj){
//        return obj.c;
//     }

}
class B{
    final AA obj;
    B(AA obj){
        this.obj=obj;
    }
    public void print_a(){
        System.out.println(AA.getA(obj));
    }

}
public class C3 {
    public static void main(String[] args) {
        AA obj_a=new AA();
        B obj_b=new B(obj_a);
        obj_b.print_a();

    }
}
