package NestedClass;

class OuterCls{
    private int x=12;

    // for accessing inner class property , we need inner class object in outer class
    void display(){
        InnerCls inerObj=new InnerCls();
        inerObj.fun();

        OuterCls.InnerCls in=new OuterCls().new InnerCls();
        in.fun();

    }

    class InnerCls{
        private int x=33;

        // static final is appilicable in inner class
        static final int vv=100;
//        final OuterCls this$0;
//        InnerCls(OuterCls outerCls){
//            this$0= outerCls;
//        }
        void fun(){
            System.out.println(x); // 33
            System.out.println(this.x); //33
            System.out.println(OuterCls.this.x); //12
        }
    }
}

public class C4 {
    public static void main(String[] args) {
        OuterCls obj= new OuterCls();
//         OuterCls.InnerCls ob= new OuterCls().new InnerCls(obj);
        OuterCls.InnerCls ob= new OuterCls().new InnerCls();
        ob.fun();

        OuterCls outer=new OuterCls();
        outer.display();


    }
}
