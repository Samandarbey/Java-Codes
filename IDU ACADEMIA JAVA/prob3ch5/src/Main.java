import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your 2 integers to compare: ");
        int x=input.nextInt();
        int y=input.nextInt();
        if (x>y){
            System.out.println(x);
        }
        else{
            System.out.println(y);
        }

    }
}

//problem 3 from ch5