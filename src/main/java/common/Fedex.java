public class Fedex {
    private final String name;
    private final String surname;

    public Fedex(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String printHello() {
        return "Hey! I'm" + name + " " + surname + "I'm the Project Leader!";
    }
}
