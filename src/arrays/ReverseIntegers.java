package arrays;

public class ReverseIntegers {
    public static int performReverseInteger(int integers) {

        long result = 0;
        while (integers != 0) {
            result = result * 10 + integers % 10;
            integers /= 10;
        }
        return (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) ? 0 : (int) result;

    }
}
