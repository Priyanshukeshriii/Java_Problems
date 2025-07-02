public class BinaryToDecimal {
    static int binToDec(int bin) {
            int num = 0;
            int i = 0 ;
            if (bin == 0) {
                return 0;
            }
            while (bin > 0) {
                int rem = bin % 10;
                bin /= 10;
                num += (int) (rem * Math.pow(2,i++));
            }
            return num;
    }

    public static void main(String[] args) {
            System.out.println(binToDec(1010));
        }
}


