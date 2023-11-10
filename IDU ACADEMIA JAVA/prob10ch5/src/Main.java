import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int a,b;
//        char letter= input.next().charAt(0);
        System.out.println("Enter your 2 digits to calculate: ");
        a= input.nextInt();
        b= input.nextInt();
        System.out.println("Enter + or - operators: ");
        char operators= input.next().charAt(0);
        if (operators=='+'){
            System.out.println(a+"+"+b+"="+(a+b));
        }
        else{
            System.out.println(a+"-"+b+"="+(a-b));
        }
    }
}

// problem 10 from ch5