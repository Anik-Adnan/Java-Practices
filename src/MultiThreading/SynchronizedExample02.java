package MultiThreading;

public class SynchronizedExample02 {
    public static void main(String[] args) {
        X x = new X();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                x.fun();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                x.fun();
            }
        });
        t1.start();
        t2.start();


    }
}

class X{
    void fun()  {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"-> "+i);
        }

//        synchronized (X.class){ // synchornized block class lock
        synchronized (this) { //synchornized block , object lock
            System.out.println("safety area started");
            for (int i = 0; i < 7; i++) {
                System.out.println(Thread.currentThread().getName() + " ->" + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("safety area ended ");
        }



        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+" ->"+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }



    }
}
