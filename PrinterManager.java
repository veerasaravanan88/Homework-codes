
package javaapplication22;


public class PrinterManager {
  private static PrinterManager S;
    private PrinterManager()
    {}
    public static synchronized PrinterManager create()
    {
        if(S==null)
        {
        S=new PrinterManager();
        }
        return S;
    }
}
