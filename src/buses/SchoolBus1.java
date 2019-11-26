package buses;

import details.Motor;

public class SchoolBus1 extends Bus implements Capabilities {
    private String type;

    public SchoolBus1 (String name, String model, int year , String type, Motor motor) {
        super(name, model, year, motor);
        this.type = type;
    }

    @Override
    public String toString() {
        return "CharterPlane( "+  "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year + ", " +
                "type='" + type + '\'' +
                ')';
    }

    @Override
    public void FuelConsumption() {
        System.out.println("10l 100/km");

    }

    @Override
    public String getInfoBus() {
        return "model= " + model + ", year= " + year ;
    }
}