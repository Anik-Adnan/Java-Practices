package day_13_14_15;

public class Class1 {
    public static void main(String[] args) throws InterruptedException {
//        Thread t= Thread.currentThread();
//        System.out.println(t.getName());
//        Thread.sleep(100000);
        MyThread mythd=new MyThread(); // new state
        System.out.println(mythd.getState());
        mythd.start(); // runable state
        System.out.println(mythd.getState());

        for(int i=1;i<10;i++){
            System.out.println(Thread.currentThread().getName()+" --> "+i);
            try{
                Thread.sleep(100);

            }catch (InterruptedException e){
                throw new RuntimeException();
            }
        }
    }
}
class MyThread extends Thread{
    public void run(){
        for(int i=1;i<10;i++){
            System.out.println(Thread.currentThread().getName()+" --> "+i);
            try{
                Thread.sleep(100);

            }catch (InterruptedException e){
                throw new RuntimeException();
            }
        }
    }

}