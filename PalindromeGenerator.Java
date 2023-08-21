public class PalindromeGenerator {

    public static void main(String[] args) {
        String input = "3943";
        int k = 1;
        String result = generatePalindrome(input, k);
        System.out.println(result);
    }

    public static String generatePalindrome(String s, int k) {
        if (k == 0) {
            if (isPalindrome(s)) {
                return s;
            } else {
                return "-1";
            }
        }

        if (isPalindrome(s)) {
            return s;
        }

        String maxPalindrome = "-1";

        for (int i = 0; i < s.length(); i++) {
            String newStr = s.substring(0, i) + s.charAt(s.length() - 1 - i) + s.substring(i + 1);
            String candidate = generatePalindrome(newStr, k - 1);
            if (!candidate.equals("-1") && Integer.parseInt(candidate) > Integer.parseInt(maxPalindrome)) {
                maxPalindrome = candidate;
            }
        }

        return maxPalindrome;
    }

    public static boolean isPalindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}
