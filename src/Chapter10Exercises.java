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


        }
    }

}
