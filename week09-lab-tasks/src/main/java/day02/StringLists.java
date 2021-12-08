package day02;

import java.util.ArrayList;
import java.util.List;

public class StringLists {

    public List<String> shortestWords(List<String> words) {
        List<String> shortestWords = new ArrayList<>();
        int minLength = getMinLength(words);
        for (String word: words) {
            if (word.length() == minLength) {
                shortestWords.add(word);
            }
        }
        return shortestWords;
    }

    public int getMinLength(List<String> words) {
        int minLength = Integer.MAX_VALUE;
        for (String word: words) {
            if (word.length() < minLength) {
                minLength = word.length();
            }
        }
        return minLength;
    }
}