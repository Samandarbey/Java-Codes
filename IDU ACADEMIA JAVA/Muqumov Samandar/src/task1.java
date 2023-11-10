import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your 3 numbers to find the biggest one: ");
        int a= input.nextInt();
        int b= input.nextInt();
        int c= input.nextInt();

        if (a>b&&a>c){
            System.out.print("The biggest one is : "+ a);
        } else if (b>a&&b>c) {
            System.out.print("The biggest one is : "+ b);
        }
        else {
            System.out.print("The biggest one is : "+ c);
        }


    }
}

// Task name: Katta Son