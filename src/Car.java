public class Car {
    private String name;
    private int wheels;
    private int cylinders;
    private boolean engine;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }


    public String startEngine() {
        return "Car->startEngine(): Engine is starting...";
    }

    public String accelerate() {
        return "Car->accelerate(): Accelerating";
    }

    public String brake() {
        return "Stopping the car";
    }
}
