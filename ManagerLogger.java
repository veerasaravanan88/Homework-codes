
package javaapplication22;

public class ManagerLogger {
    private static ManagerLogger ml;
    private ManagerLogger()
    {}
    public static synchronized ManagerLogger create()
    {
        if(ml==null)
        {
            ml=new ManagerLogger();
        }
        return ml;
    }
}
