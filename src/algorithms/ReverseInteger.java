package algorithms;

/**
 * Created by singeev on 17/07/2017.
 */
public class ReverseInteger {
    public int reverse(int x) {
        String string = new StringBuilder(Integer.toString(x)).reverse().toString();
        while(string.startsWith("0")){
            string = string.substring(1);
        }
        if(string.endsWith("-")) {
            string = "-" + string.substring(0, string.length()-1);
        }
        try {
            return Integer.valueOf(string);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
