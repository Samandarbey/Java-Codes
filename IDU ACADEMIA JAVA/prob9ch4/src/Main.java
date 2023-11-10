import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your 2 numbers to compare which one is larger: \n");
        int x,y;
        x=input.nextInt();
        y=input.nextInt();

        if (x>y){
            System.out.println(x +" is larger than "+y);
        }
        else if (x==y) {
            System.out.println("Both are equel to one another!");
        }
        else{
            System.out.println(y +" is larger than "+x);

        }
    }
}
// problem 9 from ch4