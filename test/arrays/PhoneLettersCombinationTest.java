package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

public class PhoneLettersCombinationTest {

    @Test
    void phoneLettersCombinationTest() {

        String digits = "25";
        List<String> actual = PhoneLettersCombination.performPhoneLetterCombination(digits);
        List<String> expected = Arrays.asList("aj", "bj", "cj", "ak", "bk", "ck", "al", "bl", "cl");
        assertEquals(expected, actual);
    }
}
