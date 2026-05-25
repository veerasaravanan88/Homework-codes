
package homework35;


public class Bike extends Vechicle{
    String type;
    Bike(String brand,int year,String type)
    {
        super(brand,year);
        this.type=type;
    }
    void displayinfo()
    {
        super.displayinfo();
        System.out.println("Type"+type);
    }
}
