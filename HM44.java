
package hm44;

import java.util.Scanner;


public class HM44 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the principal amount: ");
        int pamount=sc.nextInt();
        System.out.println("Enter the years"); 
        int year=sc.nextInt();
        Bankinterest.display(pamount,year );
        
    }
    
}
