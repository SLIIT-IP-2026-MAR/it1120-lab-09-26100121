public class IT26100121Lab9Q3 { 
    
    // Method to add two integers
    public static int add(int num1, int num2) {
        return num1 + num2;
    }
    
    // Method to multiply two integers  
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }
    
    // Method to square an integer
    public static int square(int num) {
        return num * num;
    }
    
    public static void main(String[] args) {
        
        // i. (3 * 4 + 5 * 7)^2
        int result1 = multiply(3, 4);           // 3 * 4 = 12
        int result2 = multiply(5, 7);           // 5 * 7 = 35
        int sum1 = add(result1, result2);       // 12 + 35 = 47
        int final1 = square(sum1);              // 47^2 = 2209
        
        System.out.println("Result of (3 * 4 + 5 * 7)^2   : " + final1);
        
        // ii. (4 + 7)^2 + (8 + 3)^2
        int sum2 = add(4, 7);                   // 4 + 7 = 11
        int sum3 = add(8, 3);                   // 8 + 3 = 11
        int square1 = square(sum2);             // 11^2 = 121
        int square2 = square(sum3);             // 11^2 = 121
        int final2 = add(square1, square2);     // 121 + 121 = 242
        
        System.out.println("Result of (4 + 7)^2 + (8 + 3)^2 : " + final2);
    }
}