import java.util.Scanner;

public class IT26100121Lab9Q4 {
    
    public static double calculateFinalMark(double assignment, double exam) {
        return (assignment * 0.30) + (exam * 0.70);
    }
    
    public static String findGrade(double finalMark) {
        if (finalMark >= 75) {
            return "A";
        } else if (finalMark >= 65) {
            return "B";
        } else if (finalMark >= 50) {
            return "C";
        } else if (finalMark >= 35) {
            return "S";
        } else {
            return "F";
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Arrays to store data for 5 students
        String[] names = new String[5];
        double[] finalMarks = new double[5];
        String[] grades = new String[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = input.next();
            
            System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
            double assignment = input.nextDouble();
            
            System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
            double exam = input.nextDouble();
            
            // Calculate and store final mark and grade
            finalMarks[i] = calculateFinalMark(assignment, exam);
            grades[i] = findGrade(finalMarks[i]);
            
            System.out.println();
        }
        
        System.out.println("Name\t\tFinal Mark\tGrade");
        
        for (int i = 0; i < 5; i++) {
            System.out.printf("%s\t\t%.2f\t\t%s\n", names[i], finalMarks[i], grades[i]);
        }
        
    }
}