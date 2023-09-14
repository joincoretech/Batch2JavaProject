package class25;

public abstract class Vehicle {

    String vin_number;
     static int totalVehicle;

     Vehicle(String vin_number){
         totalVehicle++;
         this.vin_number=vin_number;
     }

     public void totalVehicleCreated(){
         System.out.println("We build "+ totalVehicle+ " vehicles");
     }

     public void drive(){
         System.out.println("Vehicle can drive");
     }
     public void stop(){
         System.out.println("Vehicle can stop");
     }
     public abstract void start();

}

class BMW extends Vehicle{
    String model;
    String make;
    BMW(String vin_number, String make, String model){
      super(vin_number);
      this.make=make;
      this.model=model;
    }

    public void start(){
        System.out.println("BMW can start by remote");
    }
    public void speed(){
        System.out.println("BMW can go max 300k/h");
    }
    void display(){
        System.out.println("we build"+ make+" model "+model+" vin_Number "+ vin_number);
    }
}

class Toyota extends Vehicle{
    String make;
    String model;
    Toyota(String vin_number, String make, String model){
        super(vin_number);
        this.make=make;
        this.model=model;
    }
    public void start(){
        System.out.println("Toyota can be start by remote or key");
    }

    void display(){
        System.out.println("we build"+ make+" model "+model+" vin_Number "+ vin_number);
    }
}