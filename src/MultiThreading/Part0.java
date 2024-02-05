package MultiThreading;

public class Part0 {
    public static void main(String[] args) {

        Mythrd t =new Mythrd();
        t.start();
//        t.run();// main thread


    }
}

class Mythrd extends Thread{



    @Override
    public void run() {
        for(int i=0;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+" -> hello: "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
//        super.run();
    }
    @Override
    public   void start() {
        // main thread
        System.out.println(Thread.currentThread().getName()+"thread started");
        run(); //main thread
        super.start(); //new thread named thread0
    }

}
