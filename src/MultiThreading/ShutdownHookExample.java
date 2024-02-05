package MultiThreading;

public class ShutdownHookExample {
    public static void main(String[] args) {
        // Create an instance of your application
        final MyApp myApp = new MyApp();

        // Register a shutdown hook
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Shutdown hook is running...");

            // Perform cleanup or resource release tasks here
            myApp.cleanup();

            System.out.println("Shutdown hook has finished.");
        }));

        // Your application logic goes here
        myApp.run();

        // The main thread may continue with other tasks
        // ...

        // The application will exit when the main thread finishes or when explicitly terminated
    }
}

class MyApp {
    public void run() {
        System.out.println("MyApp is running...");
        // Your application logic goes here
    }

    public void cleanup() {
        System.out.println("Cleaning up resources...");
        // Perform cleanup or resource release tasks here
    }
}

