public class RectangleCalculations { 
    public static void main(String[] args) {
        
        //  inform user 
        System.out.println("--- Rectangle Area & Perimeter Calculator ---");
        
        //  give variables 
        int longEdge = 10;
        int shortEdge = 5; 

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