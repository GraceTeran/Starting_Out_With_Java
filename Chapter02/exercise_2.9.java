import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // mpg project

        System.out.println("Hello!");
        System.out.println("How many miles have you driven today?");
        System.out.println("Enter the number here: ");
        double miDriven = scanner.nextDouble();

        System.out.println("How many gallons of gas were consumed?");
        System.out.println("Enter the number here: ");
        double galUsed = scanner.nextDouble();

        double mpg = 0;

        mpg = Math.round(miDriven / galUsed);

        System.out.println("Your car gets approximately " + mpg + " miles to the gallon.");

        System.out.println("Have a beautiful day! :)");
        


    }
}
