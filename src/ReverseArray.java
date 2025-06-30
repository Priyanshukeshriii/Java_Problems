public class ReverseArray {
    static void reverseArray(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while (start<end){
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        reverseArray(arr);
        for (int num : arr){
            System.out.print(num+ ",");
        }
    }
}
