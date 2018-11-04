import java.util.Scanner;

public class Chapter11Exercises {
    public static void main(String[] args) {
        System.out.println("Pick exercise");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        //Make person class with Student and Employee subclasses etc.
        if (choice==2)
        {
            Person o = new Person();//Create noArg Person
            System.out.println("\nPerson");
            System.out.println(o.toString());
            Student d = new Student(); //Create noArg Student
            System.out.println("\nStudent");
            System.out.println(d.toString());
            System.out.println("\nEmployee");
            Employee a = new Employee(); //Create noArg Employee
            System.out.println(a.toString());
            System.out.println("\nFaculty");
            Faculty b = new Faculty(); //Create noArg Faculty member
            System.out.println(b.toString());
            System.out.println("\nStaff"); //Create noArg Staff member
            Staff c = new Staff();
            System.out.println(c.toString());
            System.out.println("\nAt last you can create a student");
            //Could have made Staff and Faculty. But should be the same
                System.out.println("Enter surname: ");
                String nam = sc.nextLine();//Fixes the code from skipping name (by adding another nextLine apparently
                String name = sc.nextLine();
                System.out.println("Enter Address: ");
                String address = sc.nextLine();

                System.out.println("Enter phoneNumber: ");
                int phoneNumber = sc.nextInt();

                System.out.println("Enter Email: ");
                String e_mail = sc.next();

                System.out.println("Enter Status: ");
                String status = sc.next();

            System.out.println();
             Student one = new Student(name,address,phoneNumber,e_mail,status);
            System.out.println("Student");
            System.out.println(one.toString());

        }
    }

}
