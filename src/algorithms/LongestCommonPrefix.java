package algorithms;

/**
 * Created by singeev on 17/07/2017.
 * Write a function to find the longest common prefix string amongst an array of strings.
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        if (strs.length != 0) {
            String first = strs[0];
            for (int i = 1; i <= first.length(); i++) {
                result = first.substring(0, i);
                for (int j = 1; j < strs.length; j++) {
                    if (i > strs[j].length() || !result.equals(strs[j].substring(0, i))) {
                        return result.substring(0, result.length() - 1);
                    }
                }
            }
        }
        return result;
    }
}
