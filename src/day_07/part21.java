package day_07;

// 3 types of interfaces ,, normal intrface, marker interface, function inerface

public class part21 {
    public static void main(String[] args) {

        add(1, 2, new Callback() { // new Callback  here is anonymous innerClass
            @Override
            public void onComplete(int result) {
                System.out.println("Result = "+ result);
            }
        });

    }
    static void add(int a,int b,Callback callback){
        int result= a+b;
        callback.onComplete(result);
    }
}

interface Callback{
    void onComplete(int result);
}