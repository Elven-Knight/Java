import java.math.BigInteger;

public class LargeFactorial {
    public static void main(String[] args) {
        System.out.println(factorial(0));;
    }

    public static String factorial(int n) {
        if (n == 0) {
            return "1";
        }
        else {
            BigInteger fact = BigInteger.valueOf(n);
            for (int i = n; i > 1; i--) {
                n--;
                fact = fact.multiply(BigInteger.valueOf(n));
            }
            return String.valueOf(fact);
        }
    }

}