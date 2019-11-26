package buses;

import details.Motor;

public class Bus {
    protected String name;
    protected String model;
    protected int year;
    protected Motor motor;

    public Bus(String name, String model, int year, Motor motor) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.motor = motor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
   // }

	//public String getInfoRegionBus() {
		
		//return null;
	}
}