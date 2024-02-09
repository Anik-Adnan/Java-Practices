package Generics;

public class RestrictedClassType {
    public static void main(String[] args) {
//    H<String> h=new H<String>(); //java: type argument java.lang.String is not within bounds of type-variable T
    H<Integer> h1=new H<>();
//    X<Q> x=new X<>(); //Q is not with in bounds of type

    }
}

class H<T extends Number>{

}
class P{

}
class Q{

}
class R extends P{

}
class X <T extends P>{

    static <T> T m(T... t){
        return t[0];
    }
}

interface I1{

}
interface I2{

}
class N extends Q implements I2,I1{

}
class F <T extends N & I1 & I2>{ //can be exact one class and more interface

}