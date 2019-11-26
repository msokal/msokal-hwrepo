import buses.SchoolBus;
import buses.RegionBus;
import details.Motor;
import details.DieselMotor;
import details.GasMotor;
import Person.Driver;
import Person.Controler;
import buses.IntFC;


public class Executor {

    public static void main(String[] args) {
        Driver driver1 = new Driver("Max", "Maximov", "A/B/C/D/E");
        Controler controler1 = new Controler("Blue", "Vest", "express");
        Motor motor1= new GasMotor(10);
        Motor motor2= new DieselMotor(15);

        SchoolBus schoolbus1 = new SchoolBus ("Maz ", "103", 2000, null, motor1);
        RegionBus regionbus1 = new RegionBus("Maz", "107", 2005, motor2);
        IntFC schoolbus2 = new SchoolBus ("Maz ", "103", 2000, null, motor1);
        IntFC regionbus2 = new RegionBus1("Maz", "107", 2005, motor2);
        schoolbus1.FuelConsumption();
        regionbus1.FuelConsumption();
      //  System.out.println(schoolbus1.getInfoBus());
       // System.out.println(regionbus1.getInfoBus());
        //
        schoolbus1.FuelConsumption();
        regionbus1.FuelConsumption();
        System.out.println(schoolbus1.getInfoBus());
        System.out.println(regionbus1.getInfoBus());

       
        System.out.println("Driver name:" + driver1.getFirstName());
        System.out.println(driver1.toString());
       
        System.out.println(controler1.toString());
       // System.out.println(schoolbus1.toString());
       // System.out.println("Fuel Consumption for School Bus= " + schoolbus1.getMotor().showFuelConsumption());
       // System.out.println("Fuel Consumption for Region Bus= " + regionbus1.getMotor().showFuelConsumption());



       
    }
}
