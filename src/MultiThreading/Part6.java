package MultiThreading;

public class Part6 {
    public static void main(String[] args) {

        // default priority 5
        Thread mainthrd =Thread.currentThread();
        mainthrd.setPriority(7); // main thread priority is set to 7
        mainthrd.setName("mian thread");
        System.out.println(mainthrd.getName());
        MyThreadd myth =new MyThreadd();
        myth.start();
        System.out.println(myth.getName()+" "+myth.getPriority());


    }
}

class MyThreadd extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }
}
