import java.util.Scanner;

public class shop
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);

        // Input number of items
        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        double[] price = new double[n];
        double total = 0;

        // Input prices
        System.out.println("Enter item prices:");
        for(int i = 0; i < n; i++) 
		{
            price[i] = sc.nextDouble();
            total += price[i];
        }

        // Apply discount
        double discount = 0;

        if(total > 5000) 
		{
            discount = total * 0.20;
        } 
		else if(total > 2000) 
		{
            discount = total * 0.10;
        }

        double finalAmount = total - discount;

        // Output
        System.out.println("Total Amount = " + total);
        System.out.println("Discount = " + discount);
        System.out.println("Final Bill = " + finalAmount);

        sc.close();
    }
}