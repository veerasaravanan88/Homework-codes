import java.util.Scanner;

public class FibonacciFunction 
{

    // Function to print Fibonacci series
    public static void printFibonacci(int n) 
	{
        int a = 0, b = 1;

        System.out.print("Fibonacci series: ");

        for (int i = 0; i < n; i++) 
		{
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        printFibonacci(n);
    }
}