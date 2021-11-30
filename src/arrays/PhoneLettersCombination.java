package arrays;

import java.util.ArrayList;
import java.util.List;

public class PhoneLettersCombination {

    private static final String [] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public static List<String> performPhoneLetterCombination(String digits) {

        List<String> list = new ArrayList<>();

        if (digits == null){
            return list;
        }
        list.add("");
        for (int i = 0; i < digits.length(); i++) {
            String str = map[digits.charAt(i) - '0'];

            List<String> next = new ArrayList<>();

            for (int j = 0; j < str.length(); j++) {
                char value = str.charAt(j);
                for(String character : list){
                    next.add(character + value);
                }
            }
            list = next;
        }
       return list;
    }
}
