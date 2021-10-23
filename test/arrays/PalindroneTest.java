package arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PalindroneTest {

    @Test
    void performPalindroneTest(){

        int numbers = 121;
        assertTrue(Palindrone.performPalindrone(numbers));
    }
}
