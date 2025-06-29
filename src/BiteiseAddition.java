import java.util.Scanner;

public class BiteiseAddition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = input.nextInt();
        System.out.println("Enter the second number: ");
        int b = input.nextInt();
        int carry;
        int sum;
        do {
            sum = a^b;
            carry = (a&b)<<1;
            a = sum;
            b=carry;
        }while(carry!=0);
        System.out.printf("The sum is %d%n",sum);






    }
}
