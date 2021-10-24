package arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ConvertRomanNumeralToIntegersTest{

    @Test
    void convertRomanNumeralsToIntegersTest(){

        String romanNumerals = "V";

        assertEquals(5, ConvertRomanNumeralToIntegers.convertRomanNumeralToInteger(romanNumerals));
    }
}
