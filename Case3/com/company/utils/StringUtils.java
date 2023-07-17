package Case3.com.company.utils;

public class StringUtils {
    public static String reverse(String s) {
        StringBuilder temp = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            temp.append(s.charAt(i));
        }

        return temp.toString();
    }
}
