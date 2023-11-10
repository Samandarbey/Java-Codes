import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter an integer N: ");
        int N=input.nextInt();
        if (N<0){
            System.out.println("Indoor activity");
        }
        else if(N>=0 && N<40){
            System.out.println("Outdoor activity");
        }
        else{
            System.out.println("Indoor activity");
        }
    }
}

//problem 1 from ch5