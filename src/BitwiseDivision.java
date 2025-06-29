import java.util.Scanner;

public class BitwiseDivision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter dividend (a): ");
        int a = input.nextInt();
        System.out.print("Enter divisor (b): ");
        int b = input.nextInt();

        if (b == 0) {
            System.out.println("Division by zero is undefined.");
            return;
        }

        int quotient = 0;
        long dividend = a;
        long divisor = b;
        long temp = 0;

        for (int i = 31; i >= 0; i--) {
            if (temp + (divisor << i) <= dividend) {
                temp += divisor << i;
                quotient |= (1 << i);
            }
        }

        System.out.println("Quotient is: " + quotient);
    }
}
