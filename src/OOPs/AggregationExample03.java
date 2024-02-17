package OOPs;

public class AggregationExample03 {
    public static void main(String[] args) {
        Engine engine = new Engine("V8", 400);
        Car car = new Car("Chevrolet Camaro", engine);

        System.out.println("Model: " + car.getModel());
        System.out.println("Engine Type: " + car.getEngine().getType());
        System.out.println("Engine Horsepower: " + car.getEngine().getHorsePower());

    }
}

class Car {
    private String model;
    private Engine engine;

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }
}

class Engine {
    private String type;
    private int horsePower;

    public Engine(String type, int horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }

    public String getType() {
        return type;
    }

    public int getHorsePower() {
        return horsePower;
    }
}

