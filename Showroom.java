import java.util.*;

public class Showroom implements utility {

    String showroomname;
    String showroomAddress;
    String managerName;
    int NumberOfEmployess;
    int NumberOfCars;

    @Override
    public void setDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the showroom name");
        showroomname = sc.nextLine();
        System.out.println("enter showrrom address");
        showroomAddress = sc.nextLine();
        System.out.println("enter the manager name");
        managerName = sc.nextLine();
        System.out.println("total no of Employees");
        NumberOfEmployess = sc.nextInt();
        System.out.println("enter the No of Cars");
        NumberOfCars = sc.nextInt();

    }

    @Override
    public void getDetails() {
        System.out.println("showroom Name" + showroomname);
        System.out.println("showroom Address" + showroomAddress);
        System.out.println("Manager Name" + managerName);
        System.out.println("Number of Employess" + NumberOfEmployess);
        System.out.println("Number of Cars" + NumberOfCars);

    }
}