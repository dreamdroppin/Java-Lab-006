//This is the sqRoot
public class MySqRoot {
    public static double squareRoot(double num) {
        double x = num / 2.0;

        //Use Math.abs
        while (Math.abs(x * x - num) >= 0.0001) {
            x = 0.5 * (x + num / x);
        }
        return x;
    }
    public static void main(String[] args) {
        double num = 16.0;
        System.out.println("Approximate square root: " + squareRoot(num));
    }
}