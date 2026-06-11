
package javaapplication22;


public class printerMain {
    public static void main(String[] args) {
        PrinterManager pm=PrinterManager.create();
        System.out.println( pm.hashCode());
        PrinterManager pm1=PrinterManager.create();
        System.out.println(pm1.hashCode());
        System.out.println(pm==pm1);
               
                }
}
