import java.util.Scanner;

// Rounding the surface of rectangular
public class Main {
    public static void main(String[] args) {
//        float firstNumber,
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first side of your rectangular(in float) : ");
        float firstNumber=input.nextFloat();
        System.out.println("Enter the second side of your rectangular(in float) : ");
        float secondNumber=input.nextFloat();
        float surface = firstNumber *secondNumber;
        System.out.print( "Result: " );
        System.out.println((float) Math.round(surface*100)/100);

    }
}