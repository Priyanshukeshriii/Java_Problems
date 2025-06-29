import java.util.Arrays;

public class SingleNumberFinder {

    public static int findSingleNumber(int[] nums){
        int result = 0;
       for (int num : nums){
           result ^= num;
       }
       return result;
    }

    public static void main(String[] args) {
        System.out.println(findSingleNumber(new int[]{1,2,3,4,5,1,3,4,5}));
    }
}
