public class Staff extends Employee {
    private String title;

    public Staff() {
        this.title = "Teacher";
    }

    public Staff(String name, String address, int phoneNumber, String e_mail, int salary, MyDate dateHired, String office, String title) {
        super(name, address, phoneNumber, e_mail, salary, dateHired, office);
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTitle: " + this.title;
    }
}
