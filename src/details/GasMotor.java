package details;

public class GasMotor extends Motor {
    public GasMotor(int fc) {
        super(fc);
    }

    @Override
    public int showFuelConsumption() {
        return getFConsump()* 2;
    }
}