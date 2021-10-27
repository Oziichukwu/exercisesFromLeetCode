package arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ConvertRomanNumeralToIntegersTest{

    @Test
    void convertRomanNumeralsToIntegersTest(){

        String romanNumerals = "XCVI";

        assertEquals(96, ConvertRomanNumeralToIntegers.convertRomanNumeralToInteger(romanNumerals));
    }
}
