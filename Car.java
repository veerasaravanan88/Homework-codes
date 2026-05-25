
package homework35;


public class Car extends Vechicle {
    int seats;
    Car(String brand,int year, int seats)
    {
        super(brand,year);
        this.seats=seats;
    }
    void display()
    {
        super.displayinfo();
        System.out.println("seats"+ seats);
    }
}
