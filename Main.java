public class Main {
    public static void main(String[] args) {

        //RECURSIVE FUNCTIONS
        System.out.println("Welcome to Recursive Functions!");

        /* Write a recursive function to calculate factorial(n). factorial(n) is n * (n-1) * (n-2) * ... * 3 * 2 * 1.
        If n is 1 or less, then factorial(n) is 1.  For example, factorial(3) is 6. */
        int num = 5;
        int calculateFactorial = factorial(num);
        System.out.println("\nFactorial of " + num + ": " + calculateFactorial);

        /* Write a recursive function to calculate fibonacci(n). fibonacci(n) is the sum of the previous two Fibonacci
        numbers. fibonacci(1) and fibonacci(2) are both 1.  For example, fibonacci(6) is 8.*/
        int a1 = 6;
        int fibonacciSequenceSum = fibonacci(a1);
        System.out.println("\nFibonacci (" + a1 + "): " + fibonacciSequenceSum);

        /* Write a recursive function output(word, n) to output a word n times.
        For example, output("jamitha ", 3) is "jamitha jamitha jamitha". */
        String word = "Ryan ";
        String outputWord = output(word, num);
        System.out.println("Word repeated" + num + "time(s): " + outputWord);
    }

    private static String output(String word, int num) {
        if (num == 1) {
            return word;

        } else {
            return output(word, num);
        }
    }

    private static int fibonacci(int a1) {
        if (a1 <= 1) {
            return a1;
        } else {
            return fibonacci(a1 - 1) + fibonacci(a1 - 2);
        }
    }

    private static int factorial(int num) {
        if (num <= 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
}
