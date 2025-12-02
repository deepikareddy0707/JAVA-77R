package loops;

public class reverseVowels {
    public static void main(String[] args) {

        String str = "Helloworld";   
        String vowels = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
                ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {

                vowels += ch;
            }
        }

        for (int i = vowels.length()-1; i >= 0; i--) {
            System.out.print(vowels.charAt(i));
        }
    }
}
