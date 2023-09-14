package class25;

public class VehicleTester {
    public static void main(String[] args) {
       /* BMW bmw=new BMW("123453AM", "Sadden", "X5");
        bmw.drive();
        bmw.start();
        bmw.display();
        bmw.totalVehicleCreated();

        Toyota toyota=new Toyota("4321TA", "SUV", "RV4");
        toyota.start();
        toyota.drive();
        toyota.totalVehicleCreated();
        toyota.display();*/

        Vehicle [] vehicles={new BMW("123453AM", "Sadden", "X5"),
                 new Toyota("4321TA", "SUV", "RV4") };

        getAllCars(vehicles);

    }
    public static void getAllCars(Vehicle [] vehicles){
        for (Vehicle v: vehicles){
            v.start();
            v.drive();
            v.totalVehicleCreated();
            v.stop();
        }
    }
}
