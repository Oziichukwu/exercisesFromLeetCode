package arrays;

import java.util.*;

import static java.lang.System.out;

public class removeDuplicateFromArray {


    public static void main(String[] args) {

//        int [] array = {1,1,2,2,3,3};
//        System.out.println(performTheDuplicate(Arrays.copyOfRange(array, 0, array.length)));

        String letters = "abbabbc";
        out.println(longestSubString(letters));

        out.println(reverse(-193));


        int[][] intialGrid = { {0,0,0,0,5},
                {0,1,1,1,0},
                {2,0,0,0,0}
        };
        out.println(new removeDuplicateFromArray().calculateOptimalPath(intialGrid));
    }

    private static int performTheDuplicate(int [] numbers){

        int j = -1;

        for (int i = 0; i < numbers.length; i++) {

            if(i == 0 || numbers[i] != numbers[i -1]){
                numbers[++j] = numbers[i];
            }
        }
        return j +1;
    }


    private static int longestSubString(String letters){
        int start = 0;
        int result = 0;

        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i< letters.length(); i++){
            char value = letters.charAt(i);
            if (map.containsKey(value) && map.get(value) >= start){
                start = map.get(value) - 1;
            }else {
                result = Math.max(result, i - start + 1);
            }
            map.put(value, i);
        }
        return result;
    }

    private static int reverse(int numbers){

        int result = 0;

        while (numbers != 0){
            result = result * 10 + numbers % 10;
            numbers /= 10;
        }
        return (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE ? 0 : result);
    }

    private static int [] twoSum(int [] numbers, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {

            int key = target - numbers[i];
            if (map.containsKey(key)){
                return new int[]{map.get(key) , i};
            }else {
                map.put(numbers[i] , i);
            }
        }
        return new int[]{};
    }

    private static int []threeSum(int [] numbers, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int key = target - (numbers[i] - numbers[i + 1]);
            if(map.containsKey(key)){
                return new int[]{map.get(key), i , i + 1};
            }else {
                map.put(numbers[i] , i);
            }
        }
        return new int[]{};
    }

    private static final String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    private static List<String>phoneNumberCombo(String digits){

        List<String> list = new ArrayList<>();

        if (digits == null){
            return list;
        }
        list.add("");

        for (int i = 0; i < digits.length(); i++) {

            String str = map[digits.charAt(i) - '0'];

            List<String> next = new ArrayList<>();

            for (int j = 0; j < str.length(); j++) {
                char value = str.charAt(i);
                for(String character : list){
                    next.add(character + value);
                }
            }
            list = next;
        }
        return list;
    }

        int total = 0;
    public int calculateOptimalPath(int [][] grid){

        if (grid == null || grid.length == 0) throw new IllegalArgumentException("grid cannot be empty");
        total = grid[grid.length - 1][0];
        if (grid.length == 1 && grid[0].length ==1 ){
            return total;
        }
        if (grid.length == 1){
            int [] newIntArray;
            newIntArray = Arrays.copyOfRange(grid[0], 1, grid[0].length);
            int [][] newGrid = {newIntArray};
            return total += calculateOptimalPath(newGrid);
        }
        if (grid[0].length == 1){
            int [][] newGrid = new int[1][1];
            newGrid[0][0] = grid[0][0];
            return total += calculateOptimalPath(newGrid);
        }
        else {
            int [][] upPathGrid = new int[grid.length -1][];
            for(int i = grid.length - 2; i >= 0; i--){
                upPathGrid[i] = Arrays.copyOfRange(grid[i] , 0, grid[0].length);
            }

            int [][] alongPathGrid = new int [grid.length][grid[0].length - 1];
            for(int i = grid.length - 1; i >= 0; i--){
                alongPathGrid[i] = Arrays.copyOfRange(grid[i], 1, grid[0].length);
            }
                return total += Math.max(calculateOptimalPath(upPathGrid), calculateOptimalPath(alongPathGrid));
        }
    }
}
