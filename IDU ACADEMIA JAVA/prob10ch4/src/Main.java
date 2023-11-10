import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int M, N;
        System.out.println("Please, Enter two different positive integers M and N: ");
        M=input.nextInt();
        N=input.nextInt();

        if (M>=N){
            System.out.println(M/N +" "+M%N);
        }
        else{
            System.out.println(N/M +" "+N%M);
        }
        System.out.println("CH4 has been finished \uD83D\uDE01 ");

    }
}
//problem 10 from ch4 finished