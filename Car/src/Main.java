public class Main {
    public static void main(String[] args) {
        Car car = new Car("2022 Blue Ferrari 296 GTS");
        Car ferrari = new GasPoweredCar("2022 Blue Ferrari 296 FTS", 15.4, 6);
        runRace(ferrari);
    }

    public static void runRace(Car car){
        car.startEngine();
        car.drive();
    }
}