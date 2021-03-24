
// Author: Gracey
// Created: 24 March 2021
// Program description:
//// 1. write a program that has variables to hold 3 test scores
//// 2. the program should ask the user to enter 3 test scores
//// 3. then assign the values entered to the variables
//// 4. the program should display the avg of the test scores
//// 5. and the letter grade that is assigned for the test score average
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

            double score1 = 0;
            System.out.println("Please enter your first test score: \n");
            score1 = scanner.nextDouble();

            double score2 = 0;
            System.out.println("Please enter your second test score: ");
            score2 = scanner.nextDouble();

            double score3 = 0;
            System.out.println("Please enter your third test score: ");
            score3 = scanner.nextDouble();

            double avgScore = 0;
            avgScore = (score1 + score2 + score3)/3;

            System.out.printf("Your average test score is %.2f. \n", avgScore);

            if (avgScore == 100)
            {
                System.out.println("Great job! Your average is a perfect A! \n");
            }
            else if (avgScore >= 90 && avgScore < 100)
            {
                System.out.println("Great job! Your average is an A!");
            }
            else if (avgScore >= 80 && avgScore <= 89)
            {
                System.out.println("Great job! Your average is a B!");
            }
            else if (avgScore >= 70 && avgScore <= 79)
            {
                System.out.println("Your average is a C.");
            }
            else if (avgScore >= 60 && avgScore <= 69)
            {
                System.out.println("Your average is a D.");
            }
            else if (avgScore < 60 && avgScore >= 0)
            {
                System.out.println("Your average is an F. Attend remedial classes.");
            }
            else
            {
                System.out.println("Invalid score. Restart program and enter new test scores.");
            }




    }
}
