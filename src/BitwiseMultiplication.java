import java.util.Scanner;

public class BitwiseMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = input.nextInt();
        System.out.println("Enter the second number: ");
        int b = input.nextInt();
        int result = 0;
        while(b>0){
            if( (b & 1) !=0){
                result += a;
            }
            a<<=1;
            b>>=1;

        }
        System.out.println("The result is "+result);
    }
}
