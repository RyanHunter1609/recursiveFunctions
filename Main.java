import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //RECURSIVE FUNCTIONS
        System.out.println("Welcome to Recursive Functions!");

        /* Write a recursive function to calculate factorial(n). factorial(n) is n * (n-1) * (n-2) * ... * 3 * 2 * 1.
        If n is 1 or less, then factorial(n) is 1.  For example, factorial(3) is 6. */
        int num = 5;
        int calculateFactorial = factorial(num);
        System.out.println("\nFactorial (" + num + "): " + calculateFactorial);

        /* Write a recursive function to calculate fibonacci(n). fibonacci(n) is the sum of the previous two Fibonacci
        numbers. fibonacci(1) and fibonacci(2) are both 1.  For example, fibonacci(6) is 8.*/
        int a1 = 6;
        int fibonacciSequenceSum = fibonacci(a1);
        System.out.println("\nFibonacci (" + a1 + "): " + fibonacciSequenceSum);

        /* Write a recursive function output(word, n) to output a word n times.
        For example, output("jamitha ", 3) is "jamitha jamitha jamitha". */
        String word = "Ryan ";
        String outputWord = output(word, num);
        System.out.println("Word repeated (" + num + ") time(s): " + outputWord);

        /* Write a recursive function to calculate the length of an ArrayList without using ArrayList.size().
        For example, [a,b,c] has length 3. */
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(3);
        integerArrayList.add(32);
        integerArrayList.add(12);
        integerArrayList.add(2);
        integerArrayList.add(0);
        integerArrayList.add(1);
        int arrayListLength = integerArrayListSize(integerArrayList);
        System.out.println("Length of Array List: " + arrayListLength);

        /* Write a recursive function to calculate sum(a,b).  sum(a,b) is the sum of a and b.
        For example, sum(2,3) is 5.*/
        int a2 = 2;
        int a3 = 3;

        int sumOf2And3 = recursiveSumOf2Nums(a2, a3);
        System.out.println("\nSum of add-in 2 and add-in 3: " + sumOf2And3);
    }

    private static int recursiveSumOf2Nums(int a2, int a3) {
        if (a3 == 0) {
            return a2;
        }
        return 1 + recursiveSumOf2Nums(a2, a3 - 1);
    }

    private static int integerArrayListSize(ArrayList<Integer> integerArrayList) {
        if (integerArrayList.isEmpty()) {
            return 0;
        } else {
            integerArrayList.remove(0);
            return 1 + integerArrayListSize(integerArrayList);

        }
    }

    private static String output(String word, int num) {
        if (num == 1) {
            return word;

        } else {
            return word + output(word, num - 1);
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
