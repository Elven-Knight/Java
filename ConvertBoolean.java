public class ConvertBoolean {
    public static void main(String[] args) {
        System.out.println(boolToWord(false));
    }

    public static String boolToWord(boolean b)
    {
        if (b) {
            return "Yes";
        }
        else
            return "No";
    }
}
