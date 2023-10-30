package day_06;

// method local innerClass ->a Class  inside a method
// methods local InnerClass only two modifiers are available ( abstract,final)


public class C6 {
    int x=10;
    static int sx=11;

    public static void main(String[] args) {
        class MLocalInnerClas{
            public void fun(){
//                System.out.println(x); // need onject of C6 class beacuse main is static
                C6 obj=new C6();
                System.out.println(obj.x);
                System.out.println(sx); // don't need object, sx is static
            }
        }

    }
}
class MethodLocalClass{
    private int x=222;

    public void localMethod() {
        // methdLocalInnerClass can be abstract or final,strictfp but never static
        // never private, protected,public
        //static blocks,non-static block,methods,statements,expression possible,
          class MethodLocalinnerClass{


            MethodLocalinnerClass(){
            }

            private int v=10;

            void fun(){
                System.out.println(x);
            }
        }

        MethodLocalinnerClass obj=new MethodLocalinnerClass();
        System.out.println(obj.v);
    }
}