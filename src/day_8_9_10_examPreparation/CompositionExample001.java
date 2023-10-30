package day_8_9_10_examPreparation;

public class CompositionExample001 {
    public static void main(String[] args) {
        Carr carr = new Carr();
        carr.start();
    }
}

class Enginee {
    public void start() {
        System.out.println("Engine started");
    }
}

class Carr {
    private Enginee enginee;

    public Carr() {
        this.enginee = new Enginee();
    }

    public void start() {
        enginee.start();
        System.out.println("Car started");
    }
}
