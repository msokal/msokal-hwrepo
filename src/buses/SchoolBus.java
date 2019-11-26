package buses;

//import details.GasMotor;
import details.Motor;

public class SchoolBus extends Bus implements Capabilities {
    private String type;

    public SchoolBus(String name, String model, int year , String type, Motor motor) {
        super(name, model, year, motor);
        this.type = type;
    }

    @Override
    public String toString() {
        return "SchoolBus( "+  "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year + ", " +
                "type='" + type + '\'' +
                ')';
    }

    @Override
    public void FuelConsumption() {
        System.out.println("10l l00/km");

    }
    @Override
    public String getInfoBus() {
        return "model= " + model + ", year= " + year ;
    }

public String setInfoBus() {
		
	 return "model= " + model + ", year= " + year ;
    
}
}