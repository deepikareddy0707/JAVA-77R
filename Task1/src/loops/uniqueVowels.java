package loops;

public class uniqueVowels {
    public static void main(String[] args) {

        String str = "Helloworld";   
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
                ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {

                if (result.indexOf(ch) == -1) {
                    result += ch;
                }
            }
        }

        System.out.println(result);
    }
}

