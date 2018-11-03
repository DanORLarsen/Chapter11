public class Student extends Person {
    String status; //FIX STATUS WONT PRINT STATUS (GET NO VALUE (NULL))
    //Cant make Final work (Constant?)
    public Student()
    {
     String Status = "Sophmore";
     this.status = Status;}

    public Student(String name, String address, int phoneNumber, String e_mail, String Status)
    {
        super(name,address,phoneNumber,e_mail);
      this.status = Status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public String toString()
    {return super.toString() + "\nStatus: " + status;

    }



}
