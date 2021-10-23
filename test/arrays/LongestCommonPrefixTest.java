package arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class LongestCommonPrefixTest {

    @Test
    void findLongestCommonPrefix(){

        String [] letters = {"abcdefgh", "aefghifk", "abcefgh"};

        String expected = "a";
        String actual = LongestCommonPrefix.performLongestPrefix(letters);
        assertEquals(expected, actual);
    }
}
