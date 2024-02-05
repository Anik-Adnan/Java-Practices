package MultiThreading;

public class SynchronizedExample {
    public static void main(String[] args) {
        A a =new A();
        //synchronized lock the entire object , not a method only
        // lock the all synvhronized methods

        // two types lock -> 1. class level lock 2. object level lock

        Thread t1 =new Thread(new Runnable() {
            @Override
            public void run() {
                a.m1();
            }
        });
        t1.setName("t1");

        Thread t2 =new Thread(new Runnable() {
            @Override
            public void run() {
                a.m2();
            }
        });
        t2.setName("t2");
        Thread t3 =new Thread(new Runnable() {
            @Override
            public void run() {
                a.m3();
            }
        });
        t3.setName("t3");
        Thread t4 =new Thread(new Runnable() {
            @Override
            public void run() {
                a.m4();
            }
        });
        t4.setName("t4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
class A {
//thread safety

    public synchronized void m1() {  //object level lock
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+" thread ->  "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public synchronized void m2() { //object level lock
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+" thread ->  "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public static synchronized void m3() { //thread safety ,class level lock
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+" thread ->  "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
    public static synchronized void m4() { //static synchronized class level lock
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+" thread ->  "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}