
package javaapplication22;

public class ManagerMain {
    public static void main(String[] args) {
        ManagerLogger ML=ManagerLogger.create();
        ManagerLogger ML1=ManagerLogger.create();

        System.out.println(ML.hashCode());
                System.out.println(ML1.hashCode());
        System.out.println(ML==ML1);
    }
}
