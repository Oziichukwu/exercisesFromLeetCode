package arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {


    public static int performLongestSubstring(String letters) {
        int result = 0;
        int start = 0;
        Map<Character, Integer> myMap = new HashMap<>();

        for (int i = 0; i < letters.length(); i++) {
            char value = letters.charAt(i);
            if (myMap.containsKey(value) && myMap.get(value) >= start) {

                start = myMap.get(value) + 1;
            } else {
                result = Math.max(result, i - start + 1);
            }
            myMap.put(value, i);
        }
        return result;

    }
}
