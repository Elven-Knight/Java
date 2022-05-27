import java.util.ArrayList;
import java.util.List;

public class Radix {
    public static void main(String[] args) {
        System.out.println(getRadix(8,2));
    }

    public static String getRadix(int number, int radix) {
        List<Character> listDigits = getDigits();
        StringBuilder value = new StringBuilder();

        while (number > 0) {
            value.insert(0, listDigits.get(number % radix));
            number = number / radix;
        }
        return value.toString();
    }

    public static List<Character> getDigits() {
        ArrayList<Character> digits = new ArrayList<Character>();
        for (char i = '0'; i <= '9'; i++) {
            digits.add(i);
        }
        for (char i = 'A'; i <= 'Z'; i++) {
            digits.add(i);
        }
        return digits;
    }
}
