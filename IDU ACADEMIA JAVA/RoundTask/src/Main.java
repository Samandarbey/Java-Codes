import java.util.Scanner;
// Round task of homework
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your number: ");
        double number = input.nextDouble();
        System.out.print("Result:");
        System.out.println(Math.round(number));


    }
}