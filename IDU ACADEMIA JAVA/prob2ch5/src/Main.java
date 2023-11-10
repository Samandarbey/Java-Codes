import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int N,M;
        System.out.println("Enter your N and M integer values: ");
        N= input.nextInt();
        M=input.nextInt();
        if(N*N==M){
            System.out.println(N+"*"+N+"="+M);
        } else if (M*M==N) {
            System.out.println(M+"*"+M+"="+N);
        } else {
            System.out.println("none!");
        }
    }
}

//problem 2 from ch5