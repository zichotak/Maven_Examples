package zot.safeoperations;

/**
 * Hello world!
 *
 */
public class Safe 
{
  public static void main( String[] args )
  {
  	System.out.println("Here");
  }
  
  public Safe() {

  }

  public static void hello() {
    System.out.println("Hello here, I am your package.");
  }

	public static void tryNumberOfArguments(String[] argmnt, int numberOfArgs) {
    try {
      if (argmnt.length != numberOfArgs) {
          throw new RuntimeException();
      }
    } catch (RuntimeException exc) {
        System.out.println("Number of arguments must be " + numberOfArgs + ". Lightning <measuredTime>.");
        System.exit(1);
    }
  } 

  public static double tryConversionToDouble(String parsed) {
    double d =  Double.NaN;
    try {
      d = Double.parseDouble(parsed);
    } 
    catch (NumberFormatException exc) {
      System.out.println("Argument must be a number.");
      System.exit(1);
    }
    return d;
  }
}