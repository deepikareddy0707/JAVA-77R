package loops;

public class duplicateChars {
    public static void main(String[] args) {

        String str = "madam";   
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            if (count == 1) {
                result += ch;
            }
        }

        System.out.println(result);
    }
}
