package Generics;

public class GenericMethod {
    public static void main(String[] args) {
    M mm =new M();
        System.out.println(mm.<Integer>fun(1,2,3,4));
        System.out.println(M.<String>fun2("String ageneric Method")); //static generic method called by

    }
}
class M{
    public <T> int fun(T... t){ //generic method
        int sum=0;
        for (T i :
                t) {
            sum = sum +(int) i;
        }
        return sum;
    }
    static <T> String fun2(T t){
        return (String) t;
    }
}
