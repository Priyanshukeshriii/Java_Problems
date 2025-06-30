public class CountEvenOddNumbers {
    static void evenOddCounter(int[] nums){
        int even = 0;
        int odd = 0;
        for (int i =0 ;i<nums.length;i++){
            if((nums[i] &1) ==0) even++;
            else odd++;
        }
        System.out.printf("%nThe number of odd is %d and even is %d",odd , even);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        evenOddCounter(arr);
    }
}
