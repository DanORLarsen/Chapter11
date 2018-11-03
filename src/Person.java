public class Person {
    private String name;
    private String address;
    private int phoneNumber;
    private String e_mail;

    public Person()
    {
     this.name = "Per Hansen";
     this.address = "Per Hansen´s vej";
     this.phoneNumber = 13371337;
     this.e_mail = "PerHansen@perEmail.dk";
    }


    public Person(String name, String address, int phoneNumber, String e_mail) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.e_mail = e_mail;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String toString()
    {return "Name: " + getName() + "\nAddress: " + getAdress() +
            "\nPhone number: " + getPhoneNumber() + "\nEmail: " + getE_mail();}
}
