public class Employee extends Person {
    private int salary;
    private MyDate dateHired;
    private String office;

    public Employee()
    {
    this.salary = 1000;
    this.dateHired = new MyDate(1999,4,4);
    this.office = "Per's office";
    }

    public Employee(String name, String address, int phoneNumber, String e_mail, int salary, MyDate dateHired, String office) {
        super(name, address, phoneNumber, e_mail);
        this.salary = salary;
        this.dateHired = dateHired;
        this.office = office;
    }
    @Override
    public String toString()
    {return super.toString() + "\nSalary: " + salary + "\nDate hired: " + dateHired.getDay() +" "+ dateHired.getMonth()+ " " + dateHired.getYear() +
     "\nOffice: " + office;
    }
}
