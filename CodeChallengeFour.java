import java.util.Scanner;

/** 

 This program takes an int array and create a new array with 
 double the length where its last element is the same  as the
 the original element
 
*/

public class CodeChallengeFour
{

   public static void main(String[] args)
   {
     
     int numEntries; // The number of enties.
     
     int[] numbers; // Array of numbers.
     
     Scanner keyboard = new Scanner (System.in); // Creates the Scanner object for the keyboard entry.
     
     
     System.out.print(" How many entries do you have? ");
     
     numEntries = keyboard.nextInt();
     
     numbers = new int[numEntries];
     
     for(int index = 0; index < numbers.length; index++)
     {
            System.out.print(" Enter number " + (index + 1) + ": "); // This displsy your option to select entries.            
            numbers[index] = keyboard.nextInt();
            }
            
            System.out.println(" These are the numbers you entered: "); // This displsys the finsl number entries.
            
     for(int index = 0; index < numbers.length; index++) // This loop creates the leading zeros.
               System.out.print( "0" );
               
     for(int index = 0; index < numbers.length; index++) // This loop creates the entry numbers.
               System.out.print( numbers[index]);
               }
     }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     

     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
  
