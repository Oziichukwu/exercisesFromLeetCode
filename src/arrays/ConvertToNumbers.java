package arrays;

import java.util.HashMap;
import java.util.Map;

public class ConvertToNumbers {

    public static void main(String[] args) {

        String romanNumeral = "MMMCDCCCIX";

        System.out.println(convertToNumbers(romanNumeral));
    }

    static final Map<Character, Integer> myMap;

    static {
        myMap = new HashMap();
        myMap.put('I', 1);
        myMap.put('V', 5);
        myMap.put('X', 10);
        myMap.put('L', 50);
        myMap.put('C', 100);
        myMap.put('D', 500);
        myMap.put('M', 1000);
    }

    public static int convertToNumbers(String romanNumeral) {

        int count = 0;
        int lengthOfString = romanNumeral.length();
        int result = 0;

        while (count < lengthOfString) {

            int number = myMap.get(romanNumeral.charAt(count));

            if (count + 1 < lengthOfString && number < myMap.get(romanNumeral.charAt(count + 1))) {

                result -= number;
            } else {
                result += number;
            }
            count++;
        }

        return result;
    }
}
