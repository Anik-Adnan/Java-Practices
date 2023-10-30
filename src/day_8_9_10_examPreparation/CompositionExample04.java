package day_8_9_10_examPreparation;

import java.io.FileWriter;
import java.io.IOException;

public class CompositionExample04 {
    public static void main(String[] args) {
        Logger consoleLogger = new ConsoleLogger();
        Logger fileLogger = new FileLogger("log.txt");

        Application app1 = new Application(consoleLogger);
        Application app2 = new Application(fileLogger);

        app1.doSomething();
        app2.doSomething();
    }
}
interface Logger {
    void log(String message);
}

class ConsoleLogger implements Logger {
    public void log(String message) {
        System.out.println(message);
    }
}

class FileLogger implements Logger {
    private String filePath;

    public FileLogger(String filePath) {
        this.filePath = filePath;
    }

    public void log(String message) {
        try {
            FileWriter writer = new FileWriter(filePath, true);
            writer.write(message + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Application {
    private Logger logger;

    public Application(Logger logger) {
        this.logger = logger;
    }

    public void doSomething() {
        logger.log("Something is happening");
    }
}

