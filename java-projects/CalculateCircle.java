import java.util.Scanner;    //we import scanner from util package 

public class CalculateCircle {
    public static void main(String[] args) {
      // informint user to let them give the radius of the circle 
        System.out.println("Write the radius of a circle");
          
        
         Scanner keyboard = new Scanner(System.in); 
        // take the radius from the student 
          double radius = keyboard.nextDouble();

          // does the area calculation 
          double area = Math.PI * radius * radius;
         
          //calculates perimeter 
          double perimeter = 2*Math.PI*radius;

          // prints area and perimeter 
                
           System.out.println("area is equal to  " + area );
           System.out.println("perimeter is equal to " + perimeter);
        }
}
