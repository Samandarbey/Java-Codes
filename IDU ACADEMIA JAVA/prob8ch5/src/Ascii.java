import java.util.Scanner;

public class Ascii {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your letter: ");
        char letter= input.next().charAt(0);
        if (letter<95&&letter>65){
            System.out.println(letter+=32);
        }
        else{
            System.out.println("None!");
        }
    }
}


//problem 8 from ch5