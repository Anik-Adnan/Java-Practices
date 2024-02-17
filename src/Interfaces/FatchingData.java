package Interfaces;
 interface CallBack {
    public abstract void onCompleted(String data);

    public abstract void onFailed(String error);
}

public class FatchingData {
    public static void main(String[] args) {
//        String data= fetch("https://www.javatpoint.com/simple-program-of-java");
//        System.out.println(" data : " + data);
//        String data2= fetch("https://www.javatpoint.com/simple-program-of-java");
//        System.out.println("Data : "+ data2);

        fetch("https://www.javatpoint.com/simple-program-of-java",new CallBack(){
            @Override
            public void onCompleted(String data) {
                System.out.println("Data: "+data);
            }

            @Override
            public void onFailed(String error) {
                System.out.println("Error: "+error);
            }
        });

        fetch("https://www.javatpoint.com/simple-program-of-java",new CallBack(){
            @Override
            public void onCompleted(String data) {
                System.out.println("Data: "+data);
            }

            @Override
            public void onFailed(String error) {
                System.out.println("Error: "+error);
            }
        });



        System.out.println(" main method complete ");

    }

//    static String fetch(String link, Callback callback){
//        new Thread(()->{
//            try {
//                Thread.sleep(5000);
//            }catch (InterruptedException e){
//                throw new RuntimeException(e);
//            }
//
//            return "Data";
//        });
//    }
    static void fetch(String link, CallBack callback) {
        new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                callback.onCompleted("Our data ");

            } catch (Exception ex) {
                callback.onFailed(ex.getMessage());
            }

        }).start();
    }
}



