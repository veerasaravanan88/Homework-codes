
package homework35;


public class MainHm {
    public static void main(String[] args) {
        System.out.println("Welcome");
        Employee em=new Employee("tony",50000);
        Manager ma=new Manager("veera",80000,"IT");
        em.displayinfo();
        ma.displayinfo();
        
        
    }
}
