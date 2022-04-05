public class Car {
    private String name;
    private int wheels;
    private int cylinders;
    private boolean engine;

    public Car(String name, int cylinders, boolean engine) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = engine;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public int getCylinders() {
        return cylinders;
    }

    public boolean isEngine() {
        return engine;
    }

    public void startEngine() {
        System.out.println("Car->startEngine(): Engine is starting...");
    }

    public void accelerate(int speed) {
        System.out.println("Car->accelerate(): Accelerating to speed " + speed);
    }
}
