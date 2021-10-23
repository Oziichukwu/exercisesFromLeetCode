package arrays;

public class ConvertIntegersToRomanNumeral {


    public static String convertToRomanNumeral(int integer) {

        int [] arabicNumerals = {1000,900,500,400,100,90,50,40,10,9,5,4,1};

        String [] romanNumerals = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder stringBuilder = new StringBuilder();

        int count = 0;

        while (integer > 0){
            for (int i = 0; i < 13; i++) {

                if (integer >= arabicNumerals[i]){
                    integer -= arabicNumerals[i];
                    stringBuilder.append(romanNumerals[i]);
                    break;
                }
                count++;
            }
        }
        return stringBuilder.toString();
    }
}
