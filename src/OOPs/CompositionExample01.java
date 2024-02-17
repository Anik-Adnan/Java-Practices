package OOPs;

public class CompositionExample01 {
    public static void main(String[] args) {
        Car2 car = new Car2("Ford Mustang", "V8", 450);

        System.out.println("Model: " + car.getModel());
        System.out.println("Engine Type: " + car.getEngine2().getType());
        System.out.println("Engine Horsepower: " + car.getEngine2().getHorsePower());

    }
}

class Engine2 {
    private String type;
    private int horsePower;

    public Engine2(String type, int horsePower) {
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

class Car2 {
    private String model;
    private Engine2 engine2;

    public Car2(String model, String engineType, int engineHorsePower) {
        this.model = model;
        this.engine2 = new Engine2(engineType, engineHorsePower);
    }

    public String getModel() {
        return model;
    }

    public Engine2 getEngine2() {
        return engine2;
    }
}
