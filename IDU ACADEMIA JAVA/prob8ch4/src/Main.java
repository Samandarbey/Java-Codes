import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number ;
        Scanner input=new Scanner(System.in);
        int n;
        System.out.println("Enter your number:");
        n= input.nextInt();
        if (n%2 == 0)
            System.out.println("Even Number");

        else{
            System.out.println("Odd Number");
        };
    }
}

//problem 8 ch4