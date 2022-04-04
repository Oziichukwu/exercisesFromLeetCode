package arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class RainTrappingTest {


    @Test
    public void Test1(){
        int [] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

        int actual = RainTrapping.trap(height);
        int expected = 6;
        assertEquals(expected, actual);
    }
}
