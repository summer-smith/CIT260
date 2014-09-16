package gallonstoliterstable;

/**
 * Program: Gallons to Liters
 * 
 * Summary: Displays a table of gallon to liter conversions
 * 
 * @author Summer
 */
public class GallonsToLitersTable {
  public static void main(String[] args){
    
   double gallons, liters;
    
    int counter = 0;
    
    for (gallons = 1; gallons <= 100; gallons++){
      liters = gallons * 3.7854;
      System.out.println(gallons + " gallons is " 
              + liters + " liters!");
      
      counter++;
      
      if (counter%10 == 0){
        System.out.println();
      }
              
    }
  }
  
}

   