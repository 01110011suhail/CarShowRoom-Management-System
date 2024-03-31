import java.util.Scanner;

public class Employees extends Showroom implements utility {
    String EmployeesName;
    String EmployeesDepartment;
    int Age;
    String showroomName;

    public void setDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Employees Name");
        EmployeesName = sc.nextLine();
        System.out.println("enter the Employess Department");
        EmployeesDepartment = sc.nextLine();
        System.out.println("enter the Age");
        Age = sc.nextInt();
        System.out.println("enter the showroom name ");
        showroomName = sc.nextLine();

    }

    public void getDetails() {
        System.out.println("Employees Name" + EmployeesName);
        System.out.println("Employees Department" + EmployeesDepartment);
        System.out.println("Employees Age" + Age);
        System.out.println("Showroom Name" + showroomName);

    }

}
