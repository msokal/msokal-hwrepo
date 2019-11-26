package details;

public abstract class Motor {
    private int FConsump;
    public abstract int showFuelConsumption();

    public Motor(int fc) {
        this.FConsump = fc;
    }

    public int getFConsump() {
        return FConsump;
    }

    public void setFConsump(int fc) {
        this.FConsump = fc;
    }
}