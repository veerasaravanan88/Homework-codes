import java.util.Scanner;

public class odd {
    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner odd = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter a number: ");
        int number = odd.nextInt();

        // Check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
		
    }
}
