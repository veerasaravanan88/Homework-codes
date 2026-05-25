
package homework35;


public class Employee {
    
    String name;
    double salary;
    Employee(String name,double salary)
    {
        this.name=name;
        this.salary=salary;
    }
    void displayinfo()
    {
        System.out.println("Employee"+name);
        System.out.println("salary"+salary);
    }
}
