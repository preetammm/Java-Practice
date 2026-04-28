
import java.util.HashSet;

public class BeautifulNumber {

    static boolean isBeautiful(int n) {
        HashSet<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = sumOfSquares(n);
        }

        return n == 1;
    }

    static int sumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num = 19;

        if (isBeautiful(num)) {
            System.out.println("Beautiful Number");
        } else {
            System.out.println("Not a Beautiful Number");
        }
    }
}
