import algorithms.LongestCommonPrefix;

public class Main {

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] array = new String[] {"ab", "", "abc"};
        System.out.println(longestCommonPrefix.longestCommonPrefix(array));
    }
}
