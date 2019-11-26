package details;

public class DieselMotor extends Motor {

    public DieselMotor(int fc) {
        super(fc);
    }

    @Override
    public int showFuelConsumption() {
        return getFConsump();
    }
}