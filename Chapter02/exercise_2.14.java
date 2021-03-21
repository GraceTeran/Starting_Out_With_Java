import java.util.Formatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello!");

        System.out.println("What is the total number of students registered to your class?");
        System.out.println("Enter the number below: ");

        double totalStudents = scanner.nextDouble();

        System.out.println("How many male students are registered to your class?");
        System.out.println("Enter the number below: ");

        double males = scanner.nextDouble();

        System.out.println("How many female students are registered to your class?");
        System.out.println("Enter the number below: ");

        double females = scanner.nextDouble();

        System.out.println("How many non-binary students are registered to your class?");
        System.out.println("Enter the number below: ");

        double nonBinary = scanner.nextDouble();

        double decimalNumMales = males / totalStudents;
        double decimalNumFemales = females / totalStudents;
        double decimalNumNonBinary = nonBinary / totalStudents;

        double percentMale = decimalNumMales * 100;
        double percentFemale = decimalNumFemales * 100;
        double percentNonBinary = decimalNumNonBinary * 100;

        System.out.println("Your class is composed of roughly " + percentMale +
                "% males, " + percentFemale + "% females, and " + percentNonBinary
        + "% non-binary individuals. ");

        System.out.println(" ");
        System.out.println("Have a great day!");
    }
}
