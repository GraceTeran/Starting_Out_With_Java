import java.util.Locale;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //
        // String f = "fuck";
        //obj.functionName();
        //f.length(); ... returns length of string
        //f.charAt(#); ... returns index position, ccounting begins at 0

        System.out.println("Hello!");
        System.out.println("Please enter the name of your favorite city: ");
        String city = scanner.nextLine();

        System.out.println(city + " has " +
                city.length() + " letters in it.");

        System.out.println(city.toUpperCase(Locale.ROOT));
        System.out.println(city.toLowerCase(Locale.ROOT));

        System.out.println("The fist letter in " + city +
                " is " + city.charAt(0) + ".");

        System.out.println(" ");
        System.out.println("Have a wonderful day!");


    }
}
