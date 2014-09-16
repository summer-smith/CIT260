package gallonstoliters;

/**
 * Program: Gallons to Liters
 * 
 * Summary: Converts a hard coded gallon value
 *          to liters and displays the result
 * 
 * @author Summer
 */
public class GallonsToLiters {

  /**
   * Driver function -- no subclasses
   */
  public static void main(String[] args) {
      //Initialize variables
      double gallons = 10; //a double is really much to large for the given purposes...
      double liters;  //just saying.
      
      
      //Apply logic
      liters = gallons * 3.7854;
      
      //Display results in command line
      System.out.println(gallons + " gallons is " + liters + " liters!");
      }
  }