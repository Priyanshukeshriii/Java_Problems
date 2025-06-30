public class SecondLargestElement {
    static int secondLargestElement(int[] nums){
        int j =0;
        int secondLargest =0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[j] < nums[i]){
                secondLargest = nums[j];
                j = i;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,10};
        System.out.println(secondLargestElement(arr));
    }
}
