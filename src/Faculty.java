public class Faculty extends Employee {
    private int officeHours;
    private String rank;

    public Faculty() {
        this.officeHours = 37;
        this.rank = "NOOB";
    }

    public Faculty(String name, String address, int phoneNumber, String e_mail, int salary, MyDate dateHired, String office, int officeHours, String rank) {
        super(name, address, phoneNumber, e_mail, salary, dateHired, office);
        this.officeHours = officeHours;
        this.rank = rank;
    }
    @Override
    public String toString()
    {return super.toString() + "\nOffice hours: " + officeHours + "\nRank: " + rank;}

}
