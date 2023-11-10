import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int number;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your number: ");
        number=input.nextInt();
        if (20<=number && number<=30){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}

// problem 7 ch4