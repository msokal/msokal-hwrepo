package buses;

import details.Motor;

public abstract class RegionBus extends Bus implements Capabilities {
    public RegionBus(String name, String model, int year, Motor motor) {
        super(name, model, year,motor);
    }

    @Override
    public void FuelConsumption() {
        System.out.println("200 km/hour");
    }

    @Override
    public String getInfoBus() {
        return "name= " + name + ", model= " + model + ", year= " + year;
    }
}