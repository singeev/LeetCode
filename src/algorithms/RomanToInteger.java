package algorithms;

/**
 * Created by singeev on 17/07/2017.
 */
public class RomanToInteger {
    public int romanToInt(String s) {
        char[] array = s.toLowerCase().toCharArray();
        int num = convert(array[array.length - 1]);
        for (int i = array.length - 1; i > 0; i--) {
            int last = convert(array[i]);
            int bLast = convert(array[i - 1]);
            if (bLast >= last) {
                num += bLast;
            } else  {
                num = num - bLast;
            }
        }
        return num;
    }

    private int convert(char a){
        switch (a){
            case 'i': return 1;
            case 'v': return 5;
            case 'x': return 10;
            case 'l': return 50;
            case 'c': return 100;
            case 'd': return 500;
            case 'm': return 1000;
            default: return 0;
        }
    }
}
