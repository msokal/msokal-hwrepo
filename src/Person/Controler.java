package Person;

public class Controler extends Person {
    private String Ticket;

    public Controler(String firstName, String lastName, String Ticket) {
        super(firstName, lastName);
        this.Ticket = Ticket;
    }

    @Override
    public String toString() {
        return "Controler" +
                "Ticket -'" + Ticket + '\'';
    }
}