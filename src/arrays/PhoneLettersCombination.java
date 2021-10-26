package arrays;

import java.util.ArrayList;
import java.util.List;

public class PhoneLettersCombination {

    public static final String [] mapping = {"","","abc","def","ghi","jkl","mno","pqrs"
    ,"tuv","wxyz"};

    public static List<String> performPhoneLetterCombination(String digits) {

        List<String> currentPosition = new ArrayList<>();
        if (digits.length()==0){
            return currentPosition;
        }
        currentPosition.add("");
        for (int i = 0; i < digits.length(); i++) {
            String str = mapping[digits.charAt(i) - '0'];
            List<String> nextLetter = new ArrayList<>();
            for (int j = 0; j < str.length(); j++) {
                char letter = str.charAt(j);
                for (String combination : currentPosition){
                    nextLetter.add(combination + letter);
                }
            }
            currentPosition = nextLetter;
        }
        return currentPosition;
    }
}
