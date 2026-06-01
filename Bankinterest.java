
package hm44;


public class Bankinterest {
    static final String bankname="veera bank";
    static final Double irate=7.5;
    static Double display(int principal,int years)
    {
        Double interest=(principal*irate*years)/100;
        System.out.println("Bank Name: " + bankname);
        System.out.println("Principal Amount: " + principal);
        System.out.println("Years: " + years);
        System.out.println("Interest Amount: " + interest);
        return interest;
    }
    
}
