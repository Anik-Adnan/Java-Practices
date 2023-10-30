package MultiThreading;

public class Part4 {
    public static void main(String[] args) {
        Thread thread1=new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName()+" : "+i);
                Thread.yield();
            }
        });

        Thread thread2=new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName()+" : "+i);
            }
        });
//        thread1.setPriority(10);
//        thread2.setPriority(10);

        thread1.start();
        thread2.start();


    }
}
