import java.util.Scanner;    //we import scanner from util package 

public class ScannerTry{
       public static void main(String[] args) {
     
        Scanner keyboard = new Scanner(System.in); 
     
        //  inform user 
        System.out.println("--- Rectangle Area & Perimeter Calculator ---");
         System.out.println("Please write LongEdge and shortEdge ");
         
         System.out.println("Please use integer numbers ");
        
         //scanner takes the numbers 
          int longEdge = keyboard.nextInt();
          int shortEdge = keyboard.nextInt();
        

        // Calculation
        int area = longEdge * shortEdge;
        int perimeter = (longEdge * 2) + (shortEdge * 2);

        // Results
        System.out.println("Long Edge: " + longEdge);
        System.out.println("Short Edge: " + shortEdge);
        System.out.println("-------------------------");
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}

