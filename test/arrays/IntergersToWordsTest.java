package arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntergersToWordsTest {

    @Test
    void testThatIntegersCanBeConvertedToWords() {

        int number = 126;

        String actual = IntergersToWords.performConversionToWords(number);

        String expected = "One Hundred Twenty Six";

        assertEquals(expected, actual);
    }
}
