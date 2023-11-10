
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
//problem 3 ch4
        //Values of each digit
        int hundreds ;
        int tens ;
        int ones ;
        int number;
        //Create new scanner
        Scanner input = new Scanner(System.in);



        //Prompt user to input 3 digit number
        System.out.print("Enter a 3 digit number: ");
        number = input.nextInt();


        //Displays hundreds place digit
        hundreds = number / 100;
        System.out.printf("Hundreds place digit: " + hundreds);

        //Displays tens digit
        tens = (number % 100)/10;
        System.out.printf("\nTens place digit: " + tens);


        //Display ones digit
        ones = (number-(tens*10)-(hundreds*100));
        System.out.printf("\nOnes place digit: " + ones);


        //Error if number is less or more then three digits
//        if (number > 999);
//        System.out.println("\nError! Number more then 3 digits.");
//        if (number < 100);
//        System.out.println("Error! Number less then 3 digits.");
    }
}