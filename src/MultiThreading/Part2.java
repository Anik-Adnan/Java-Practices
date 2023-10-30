package MultiThreading;

public class  Part2 {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread=new MyThread(); // new state

        System.out.println(myThread.getState());
        myThread.start(); // runable state
        System.out.println(myThread.getState());
//        Thread.sleep(1000);
//        System.out.println(myThread.getState());
        
        for(int i = 0; i<=10; i++){
            System.out.println("main thread "+"-> "+i);
            try{
                Thread.sleep(100);
            }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        for(int i = 0; i<=10; i++){
            System.out.println("MyThread "+"-> "+i);
            try{
                Thread.sleep(100);
            }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}