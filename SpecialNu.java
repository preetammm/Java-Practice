
import java.util.Scanner;

public class SpecialNu {
    
    // Function to calculate factorial
    static int factorial(int digit) {
        int fact = 1;
        for (int i = 1; i <= digit; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;

        // Calculate sum of factorial of digits
        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num = num / 10;
        }

        // Check Special Number condition
        if (sum == original) {
            System.out.println(original + " is a Special Number");
        } else {
            System.out.println(original + " is not a Special Number");
        }

        sc.close();
    }
}
