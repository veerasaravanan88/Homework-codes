import java.util.Scanner;
 class Loan1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Age: ");
        int age = sc.nextInt();

        System.out.print("Salary: ");
        int salary = sc.nextInt();

        System.out.print("CIBIL: ");
        int cibil = sc.nextInt();

        System.out.print("Existing Customer (true/false): ");
        boolean customer = sc.nextBoolean();

        if (age >= 21) {
            if (salary >= 20000) {
                if (cibil >= 750) {
                    if (customer) {
                        System.out.println(name + " Premium Loan");
                    } else {
                        System.out.println(name + " Standard Loan");
                    }
                } else {
                    if (cibil >= 650) {
                        System.out.println(name + " Low Loan");
                    } else {
                        System.out.println(name + " Not Eligible (Low CIBIL)");
                    }
                }
            } else {
                System.out.println(name + " Not Eligible (Low Salary)");
            }
        } else {
            System.out.println(name + " Not Eligible (Age)");
        }

        sc.close();
    }
}