import java.util.Scanner;

public class BitwiseSubstraction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = input.nextInt();
        System.out.println("Enter the second number: ");
        int b = input.nextInt();
        int sub;
        int borrow;
        do {
            sub= a^b;
            borrow= (~a&b )<< 1;
            a=sub;
            b=borrow;
        }while (borrow !=0);
        System.out.println("The result is "+sub);
    }
}
