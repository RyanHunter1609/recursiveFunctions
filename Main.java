public class Main {
    public static void main(String[] args) {
//RECURSIVE FUNCTIONS

/* Write a recursive function to calculate factorial(n).
factorial(n) is n * (n-1) * (n-2) * ... * 3 * 2 * 1.
If n is 1 or less, then factorial(n) is 1.  For example, factorial(3) is 6. */
        int num = 5;
        int factorialCalc = calculateFactorial(num);
        System.out.println("Welcome to Recursive Functions!");
        System.out.println("Factorial of " + num + ": " + factorialCalc);
    }

    private static int calculateFactorial(int num) {
        if (num <= 1) {
            return 1;
        } else {
            return num * calculateFactorial(num - 1);
        }
    }
}
