import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int A,B,C,D,E,N;
        int inputt;
        System.out.println("Enter your input: ");
        inputt=input.nextInt();
        if(inputt%2==0&&inputt%3==0&&(inputt%5==0)){
            System.out.println("A");
        }
        else if(inputt%2==0&&inputt%3==0){
            System.out.println("B");
        }
        else if(inputt%2==0&&inputt%5==0){
            System.out.println("C");
        }
        else if(inputt%3==0&&inputt%5==0){
            System.out.println("D");
        }
        else if(inputt%2==0||inputt%3==0||(inputt%5==0)){
            System.out.println("E");
        }
        else{
            System.out.println("N");
        }
    }
}

//problem 5 from ch5