//package factorial;
import java.util.Scanner;

public class RoomDimension {

    public static void main(String args[])
   {
      int length;
      int width;
 
      System.out.println("Enter the length");
      Scanner in = new Scanner(System.in);
 
      length = in.nextInt();
      
      System.out.println("Enter the width");
      Scanner il = new Scanner(System.in);
 
      width = in.nextInt();
      double cost;
      cost = width * length * 8.00;
 
      
 
         System.out.println("The cost will be "+cost);
      

    
    }
}