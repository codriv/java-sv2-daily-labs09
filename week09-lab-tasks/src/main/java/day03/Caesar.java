package day03;

public class Caesar extends Encryption {

    private int offset;

    public Caesar(int offset) {
        this.offset = offset;
    }

    public String encrypts(String input) {
        String[] wordsArray = input.split("\s+");
        for ( int i = 0; i < wordsArray.length; i++) {
            wordsArray[i] = getEncryptedWord(wordsArray[i]);
        }
        return String.join(" ", wordsArray);
    }

    private String getEncryptedWord(String input) {
        char[] inputArray = input.toCharArray();
        for (int i = 0; i < input.length(); i++) {
            int shifted = inputArray[i] + (offset % 26);
                inputArray[i] = (char) (shifted - ((shifted - 'a') / 26) * 26);
            }
        return String.valueOf(inputArray);
    }
}