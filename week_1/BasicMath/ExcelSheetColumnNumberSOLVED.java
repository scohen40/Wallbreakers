package week_1.BasicMath;

/**
 * SOLVED
 */
public class ExcelSheetColumnNumberSOLVED {
    public int titleToNumber(String s) {
        int number = 0;
        for(int i = 0; i < s.length(); i++) {
            number = (number*26) + (s.charAt(i) - 'A' + 1);
        }
        return number;
    }
}
