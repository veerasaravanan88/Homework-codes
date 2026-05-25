
package homework35;


public class Vechicle {
    String brand;
    int year;
    Vechicle(String brand,int year)
    {
        this.brand=brand;
        this.year=year;
    }
    void displayinfo()
    {
        System.out.println("Brand"+brand);
        System.out.println("year"+year);
    }
}
