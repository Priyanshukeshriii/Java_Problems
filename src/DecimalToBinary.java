public class DecimalToBinary {
    static String decToBin(int num) {
        StringBuilder binary = new StringBuilder();
        if (num == 0) {
            return "0";
        }
        while (num > 0) {
            int rem = num % 2;
            num /= 2;
            binary.insert(0, rem);
        }
        return binary.toString();
    }

    public static void main(String[] args) {
        System.out.println(decToBin(13));
    }
}
