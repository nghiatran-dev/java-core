package Chapter8.Video78;

public class Video78 {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota");
        Bus myBus = new Bus("Thaco");
        Motorbike myBike = new Motorbike("Yamaha");

        // Option 1:
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = myCar;
        vehicles[1] = myBus;
        vehicles[2] = myBike;

        // Option 2:
        Vehicle[] vehicles2 = {myCar, myBus, myBike};
        for (Vehicle vehicle: vehicles2) {
            vehicle.start();
        }
    }
}
