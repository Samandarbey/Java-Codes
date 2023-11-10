import java.util.Scanner;
// Factarial hisoblash
public class Main {
        public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        System.out.println("Enter your number to calculate factarial of this number");
            long factorial = 1;
            for(int i = 1; i <= num; ++i)
            {
                // factorial = factorial * i;
                factorial *= i;
            }
            System.out.printf("Factorial of %d is %d", num, factorial);

    }
}