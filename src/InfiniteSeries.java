//The xtra credit
public class InfiniteSeries {
    public static double gauss(double x, int n) {
        double sum = 1.0; //i = 0
        double term = 1.0; //first term
        double powerOfX = 1.0; //the power

        for (int i = 1; i < n; i++) {
            term *= -1.0;
            powerOfX *= x * x;
            double currentTerm = term * powerOfX / factorial(2 * i);
            sum += currentTerm;
        }
        return sum;
    }

    private static int factorial(int num) {
        int result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i; //* is to multiply
        }
        return result;
    }

    public static void main(String[] args) {
        double x = 2.0;
        int n = 10;
        System.out.println("Sum of the first " + n + " terms: " + gauss(x, n));
    }
}
