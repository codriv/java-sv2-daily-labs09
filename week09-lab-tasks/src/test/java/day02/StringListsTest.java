package day02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringListsTest {

    @Test
    void testShortestWord() {
        StringLists stringLists = new StringLists();
        List<String> shortestWords = stringLists.shortestWords(Arrays.asList("aaa", "aa", "bb", "cccc", "dd"));
        assertEquals(Arrays.asList("aa", "bb", "dd"), shortestWords);
    }
}