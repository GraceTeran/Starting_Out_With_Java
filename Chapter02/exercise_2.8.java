import java.util.Scanner;

class Main {

  static Scanner scanner = new Scanner(System.in); 

  public static void main(String[] args) {

    final int cookiesPerBag = 40,  servingsPerBag = 10, servingSize = 4, servingCal = 300, cookieCal = 75;

    System.out.println("How many cookies have you eaten today?");
    System.out.println("Enter number of cookies here: ");
    

    int cookiesEaten = scanner.nextInt();

    int totalCal = cookiesEaten * cookieCal; 
    
    System.out.println("Calories Consumed: " + totalCal);
    System.out.println("Have a delicious day!!");

  

 
  }
}
