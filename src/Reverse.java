
public class Reverse {

    public static void main(String[] args) {
        Reverse reverse = new Reverse();
        reverse.reverseString("Salam");
    }
    public String reverseString(String s) {

            if (s == null || s.length() == 0) {
                return s;
            }
            char[] sChars = s.toCharArray();
            int j = sChars.length - 1;

            char tempChar;

            for (int i = 0; i < j; i++) {

                if (i < j) {
                    tempChar = sChars[i];
                    sChars[i] = sChars[j];
                    sChars[j] = tempChar;
                    j--;
                }
            }
        System.out.println(sChars);
            return new String (sChars);
        }
}