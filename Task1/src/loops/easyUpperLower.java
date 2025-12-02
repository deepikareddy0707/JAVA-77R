package loops;

public class easyUpperLower {
    public static void main(String[] args) {

        String str = "NumberOne";   
        String upper = "";
        String lower = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                upper += ch;    
            } else {
                lower += ch;    
            }
        }

        String rev = "";
        for (int i = upper.length() - 1; i >= 0; i--) {
            rev += upper.charAt(i);
        }

        System.out.println(rev + lower);
    }
}
