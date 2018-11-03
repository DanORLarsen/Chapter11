import java.util.Scanner;

public class Chapter10Exercises {
    public static void main(String[] args) {
        System.out.println("Pick exercise");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        //Make person class with Student and Employee subclasses etc.
        if (choice==2)
        {
            Student d = new Student();
            System.out.println("\nStudent");
            System.out.println(d.toString());
            System.out.println("\nEmployee");
            Employee a = new Employee();
            System.out.println(a.toString());
            System.out.println("\nFaculty");
            Faculty b = new Faculty();
            System.out.println(b.toString());
            System.out.println("\nStaff");
            Staff c = new Staff();
            System.out.println(c.toString());
            System.out.println("At last you can create a student");
            //Could have made Staff and Faculty. But should be the same
                System.out.println("Enter name: ");
                String name = sc.nextLine();//Wont work

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
