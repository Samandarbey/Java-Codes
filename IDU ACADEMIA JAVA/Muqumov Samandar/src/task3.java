import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your IELTS section scores: ");
        System.out.print("Listening: ");
        float listening = input.nextFloat();
        System.out.println("Reading: ");
        float reading = input.nextFloat();
        System.out.println("Writing: ");
        float writing = input.nextFloat();
        System.out.println("Speaking: ");
        float speaking= input.nextFloat();
        System.out.print("Your overall IELTS band score is: ");
        System.out.println((float) Math.round((listening+reading+writing+speaking)/4));

    }
}


// Task name: IELTS
