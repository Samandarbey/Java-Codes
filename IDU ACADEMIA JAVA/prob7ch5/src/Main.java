import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {



        Random random = new Random();
        int randomNumber = random.nextInt(6) + 1;
//        System.out.println(randomNumber);
        System.out.println("Enter the number: ");
        Scanner input=new Scanner(System.in);
        while (true){
            int guess=input.nextInt();
            if (guess==randomNumber){
                System.out.println("Correct");
                break;
            }
            else if(guess>randomNumber){
                System.err.println("Down");

            }
            else{
                System.err.println("Up");
            }

        }
    }
}

//problem 7 from ch5