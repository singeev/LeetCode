package algorithms;

/**
 * Created by singeev on 17/07/2017.
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String string = Integer.toString(x);
        String reverse = new StringBuilder(string).reverse().toString();
        return string.equals(reverse);
    }
}
