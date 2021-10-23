package arrays;

public class CalculateSumOfIntegers {

    public static int performSumOfAllIntegersInaString(String str) {


        int sum = 0;
        char [] charArray = str.toCharArray();
        String temp = "";

        for (int i = 0; i < charArray.length; i++) {
            char myChar = charArray[i];
            if (Character.isDigit(myChar)){

                temp += myChar;
            }else {
                if (temp != ""){
                    sum+= Integer.parseInt(temp);
                }
            }
        }
        return sum;
    }
}
