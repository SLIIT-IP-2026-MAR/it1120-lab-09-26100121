import java.util.Scanner;

public class IT26100121Lab9Q1 { 
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter value a: ");
        double a = input.nextDouble();
        
        System.out.print("Enter value b: ");
        double b = input.nextDouble();
        
        System.out.print("Enter value c: ");
        double c = input.nextDouble();
        
        // Calculate discriminant: b^2 - 4ac
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        
        // Check nature of roots using discriminant
        if (discriminant > 0) {
            // Two real and different roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            
            System.out.println("\nRoots are real and different :");
            System.out.printf("Root 1: %.2f\n", root1);
            System.out.printf("Root 2: %.2f\n", root2);
            
        } else if (discriminant == 0) {
            // Two real and equal roots
            double root = -b / (2 * a);
            System.out.println("\nRoots are real and equal :");
            System.out.printf("Root: %.2f\n", root);
            
        } else {
            // Imaginary roots
            System.out.println("\nRoots are imaginary");
        }
        
    }
}