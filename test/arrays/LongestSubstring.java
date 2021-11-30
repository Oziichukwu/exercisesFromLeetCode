package arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class LongestSubstringTest {

    @Test
    void longestSubstring(){

        String letters = "pwwekw";

        int actual = LongestSubstring.performLongestSubstring(letters);

        int expected = 3;
        System.out.println(LongestSubstring.performLongestSubstring(letters));

        assertEquals(expected, actual);

    }
}
