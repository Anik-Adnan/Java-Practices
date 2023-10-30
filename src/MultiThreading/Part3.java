package MultiThreading;

public class Part3 {
    public static void main(String[] args) {
        MyRunable myRunable =new MyRunable();
        Thread thread=new Thread(myRunable,"thread name - runable thread");
        thread.start();
        //thread.run(); //donot create a new thread
        // "thread name - runable thread"  is childThread of main thread
        // here mainThread is ParentThread
        // child thread got his parent thread's priority by default (that is 5 'normal priority')
        // main thread have no parent thread, create by the JVM

        System.out.println(thread.getId());

        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
    }
}
class MyRunable implements Runnable{

    @Override
    public void run() {
        System.out.println("my Runable thread ");
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
        System.out.println("complete thread");
    }
}
