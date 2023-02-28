import java.util.Scanner;

public class AnimalPicker2 {
   public static void main(String[] args) {
     // Creating a new Scanner object to read user input
     Scanner scanner = new Scanner(System.in);
     // Declare string to store user choice
     String animalChoice;
     boolean validInput = false;

     //Loop until the user types a valid input
     while (!validInput) {
         // Prompt for user
         System.out.println("Which animal would you like to see? (dog, cat, or fish)");

         // Read user input
         animalChoice = scanner.nextLine();


     }
   }
}