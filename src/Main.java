public class Main {
    public static void main(String[] args) {

        Car theCar;

        for(int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                    theCar = new Car("Base car", 8);
                    break;
                case 1:
                    theCar = new Mitsubishi("Outlander VRX 4WD", 6);
                    break;
                case 2:
                    theCar = new Holden("Holden Commodore", 6);
                    break;
                case 3:
                    theCar = new Ford("Ford Falcon", 6);
                    break;
                default:
                    theCar = null;
            }

            System.out.println(theCar.startEngine());
            System.out.println(theCar.accelerate());
            System.out.println(theCar.brake());
            System.out.println("*******************");
        }


    }
}
