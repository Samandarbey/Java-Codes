import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your 3 numbers to find the max and min ones:  ");
        int a,b,c;
        a= input.nextInt();
        b= input.nextInt();
        c= input.nextInt();
        if ((a>b && a>c)){
            System.out.println("Max is: "+ a);
            if (b<a&&b<c){
                System.out.println("Min is: "+ b);
            }
            else {
                System.out.println("Min is: "+ c);
            }

        } else if (b>a&&b>c) {
            System.out.println("Max is: "+ b);
            if (a<b&&a<c){
                System.out.println("Min is: "+ a);
            }
            else{
                System.out.println("Min is: "+ c);
            }
        }
        else if (c>a&&c>b){
            System.out.println("Max is: "+ c);
            if(b<a&&b<c){
                System.out.println("Min is: "+ b);
            }
            else{
                System.out.println("Min is: "+ a);
            }
        }

        System.out.println();
    }
}

// problem 4 from ch5