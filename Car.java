import java.util.Scanner;

public class Car extends Showroom implements utility {
    String carName;
    String CarColor;
    String FuelType;
    String brand;
    int Carprice;

    public void setDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the car name");
        carName = sc.nextLine();
        System.out.println("enter the car Color");
        CarColor = sc.nextLine();
        System.out.println("enter the Fuel type");
        FuelType = sc.nextLine();
        System.out.println("enter the car Barand");
        brand = sc.nextLine();
        System.out.println("enter the car price");
        Carprice = sc.nextInt();

    }

    public void getDetails() {
        System.out.println("Car Name" + carName);
        System.out.println("car Color" + CarColor);
        System.out.println("Fuel Type" + FuelType);
        System.out.println("car brand" + brand);
        System.out.println("Car Price" + Carprice);
    }

}
