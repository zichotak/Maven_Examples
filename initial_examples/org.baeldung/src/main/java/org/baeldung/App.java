package org.baeldung;
import com.mycompany.app.*;
import zot.safeoperations.*;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        com.mycompany.app.App ap = new com.mycompany.app.App();
        ap.hello();
        // Safe sf = new Safe();
        Safe.hello();
        String[] str = new String[2];
        str[0] = "Arg1";
        str[1] = "Arg2";

        Safe.tryNumberOfArguments(str, 2);
        double a = Safe.tryConversionToDouble("12.156");

        System.out.println("a = " + a);
        // sf.tryNumberOfArguments(str, 1);
    }
}
