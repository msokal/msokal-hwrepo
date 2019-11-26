package buspark;


import buses.Capabilities;

public class buspark {
    private String name;


    public buspark(String name) {
        this.name = name;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "buspark" +
                "name='" + name;
    }
}