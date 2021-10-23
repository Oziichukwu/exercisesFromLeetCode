package arrays;

public class LongestCommonPrefix {

    public static String performLongestPrefix(String[] letters) {

        if (letters.length == 0){
            return "";
        }

        int shortest = Integer.MAX_VALUE;
        for (String str : letters){
            shortest = Math.min(shortest, str.length());
        }

        int count = 0;

        while (count < shortest){
            for (String str : letters){
                if (str.charAt(count) != letters[0].charAt(count)){
                    return letters[0].substring(0,count);
                }
            }
            count++;
        }
        return letters[0].substring(0, shortest);
    }
}
