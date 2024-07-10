import java.util.Scanner;

public class CityDistance {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter distance between City 1 and City 2 (in kilometers): ");
        double distanceInKilometers = scanner.nextDouble();

        convertAndDisplayDistances(distanceInKilometers);
    }

    public static void convertAndDisplayDistances(double distanceInKilometers) {
        
        double metersConversion = distanceInKilometers * 1000;
        double centimetersConversion = distanceInKilometers * 1000;
        double feetConversion = distanceInKilometers * 3280.84;
        double inchesConversion = distanceInKilometers * 39370.1;

        
        System.out.println("Distance in Meters: " + metersConversion + " meters");
        System.out.println("Distance in Centimeters: " + centimetersConversion + " centimeters");
        System.out.println("Distance in Feet: " + feetConversion + " feet");
        System.out.println("Distance in Inches: " + inchesConversion + " inches");
    }
}
