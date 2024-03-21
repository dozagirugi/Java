package Java_Problem.Array_Iteration;

public class Problem_4 {
    public static void main(String[] args) {
        String sentence = "Life is beautiful.";

        int[] result = count(sentence);

        System.out.printf("%s\n=> 자음 %d개, 모음 %d개", sentence, result[0], result[1]);
    }

    public static int[] count(String sentence) {
        int consonant = 0;
        int vowel = 0;

        char[] characters = sentence.toUpperCase().toCharArray();

        for (int i=0; i<characters.length; i++) {
            switch (characters[i]) {
                case 'A' :
                case 'E' :
                case 'I' :
                case 'O' :
                case 'U' :
                    vowel ++;
                    break;

                case ' ' :
                case ',' :
                case '.' :
                case '\t' :
                case '\n' :
                    break;

                default:
                    consonant++;
                    break;
            }
        }
        return new int[] {consonant, vowel};
    }
}
