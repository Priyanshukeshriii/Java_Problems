public class ElementPersent {
    public static boolean isPersent(int[] nums, int a){
        for (int num :nums){
            if((a ^ num) ==0){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPersent(new int[]{1, 4, 6},4));
    }
}
