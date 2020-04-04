import api.Vehicle;
import model.Bike;
import model.Car;

public class Main {
    public static void main(String[] args) {

        Vehicle bike = new Bike();
        Vehicle car = new Car();

        System.out.println("Bike:");
        bike.drive();
        bike.stop();
        System.out.println();
        System.out.println("Car:");
        car.drive();
        car.stop();

    }
}
