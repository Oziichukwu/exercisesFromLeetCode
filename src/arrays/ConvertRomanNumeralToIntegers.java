package arrays;

import java.util.HashMap;
import java.util.Map;

public class ConvertRomanNumeralToIntegers {
    @SuppressWarnings("serial")
    private static Map<Character, Integer> myMap = new HashMap<>(){{

        myMap.put('I',1);
        myMap.put('V', 5);
        myMap.put('X',10);
        myMap.put('L',50);
        myMap.put('C',100);
        myMap.put('D', 500);
        myMap.put('M',1000);
    }};

    public static int convertRomanNumeralToInteger(String romanNumerals) {

        int count = 0;
        int result = 0;
        int lengthOfString = romanNumerals.length();

        while(count < lengthOfString){

            int number = myMap.get(romanNumerals.charAt(count));

            if (count + 1 < lengthOfString && number < myMap.get(romanNumerals.charAt(count+1))){

                result -= number;
            }
            else {
                result += number;
            }
            count++;
        }
        return result;
    }
}
