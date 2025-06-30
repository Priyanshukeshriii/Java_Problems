import java.util.Arrays;

public class RemoveDuplicates {
    public static int[] removeDuplicates(int[] nums){
        int i =0;
        for (int j = 1; j < nums.length; j++) {
            if(nums[j] != nums[i]){
                i++;
                nums[i] =nums[j];
            }
        }

        int[] newnums = Arrays.copyOf(nums, i + 1);
        return newnums;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 1, 2, 2, 3, 4, 4,5,6};
        int[] newarr = removeDuplicates(arr);
        for (int num: newarr){
            System.out.println(num);
        }
    }
}
