import java.util.Scanner;

public class Code
{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Welcome to Serindipity Bookseller's Book Club!! \n");
        System.out.println("How many books have you purchased this month? \n");
        System.out.println("Enter the number below: \n");

        int book = scanner.nextInt();

        while (book < 0)
        {
            System.out.println("Invalid input. Try again.");
            // get another input
            book = scanner.nextInt();
        }

        int points = 0;

        switch (book)
        {
            case 0:
                points = 0;
                System.out.println("You haven't earned any points this month! \n");
                System.out.println("Time to buy some books! \n");
                break;
            case 1:
                points = 5;
                System.out.println("You have earned " + points + " points with your purchase of "
                        + book + " book this month.");
                break;
            case 2:
                points = 15;
                System.out.println("You have earned " + points + " points with your purchase of "
                        + book + " books this month.");
                break;
            case 3:
                points = 30;
                System.out.println("You have earned " + points + " points with your purchase of "
                        + book + " books this month.");
                break;
            default:
                points = 60;
                System.out.println("You have earned " + points + " points with your purchase of "
                        + book + " books this month.");
                break;
        }


        System.out.println("Thank you for your patronage at Serindipity Booksellers!! \n");


    }
}
