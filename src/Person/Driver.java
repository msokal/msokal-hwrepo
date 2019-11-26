package Person;

public class Driver extends Person {
    private String category;

    public Driver(String firstName, String lastName, String category) {
        super(firstName, lastName);
        this.category = category;
    }

    @Override
    public String toString() {
        return "Driver" +
                " category ='" + category + '\'';
    }
}