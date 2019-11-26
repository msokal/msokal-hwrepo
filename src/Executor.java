import buses.SchoolBus1;
import buspark.buspark;
import buses.RegionBus1;
import details.Motor;
import details.DieselMotor;
import details.GasMotor;
import Person.Driver;
import Person.Controler;
import buses.Capabilities;


public class Executor {

    public static void main(String[] args) {
        Driver driver1 = new Driver("Max", "Maximov", "A/B/C/D/E");
        Controler controler1 = new Controler("Blue", "Vest", "econom");
        Motor motor1= new GasMotor(10);
        Motor motor2= new DieselMotor(20);

        SchoolBus1 schoolbus1 = new SchoolBus1("Maz ", "103", 2000, schoolbus1);
        RegionBus1 regionbus1 = new RegionBus1("Maz", "107", 2005, regionbus1);
        
        schoolbus1.FuelConsumption();
        regionbus1.FuelConsumption();
        System.out.println(schoolbus1.getInfoBus());
        System.out.println(regionbus1.getInfoBus());

       // Buspark buspark1 = new Buspark("buspark ¹2");

        System.out.println(driver1.toString());
        System.out.println("Driver first name:" + driver1.getFirstName());
        System.out.println(controler1.toString());
        System.out.println(schoolbus1.toString());
        System.out.println("Fuel Consumption for School Bus= " + schoolbus1.getMotor().showFuelConsumption());
        System.out.println("Fuel Consumption for Region Bus= " + regionbus1.getMotor().showFuelConsumption());



       //System.out.println(buspark1.toString());
    }
}