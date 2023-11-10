import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int a=5;
        int b=2;
        int c=5;
        int strike=0;
        int balls=0;
        System.out.println("Enter your numbers: ");
        int x= input.nextInt();
        int y= input.nextInt();
        int d= input.nextInt();
        if (a==x){
            strike+=1;
        }
        else if(b==y||c==d){
            balls+=1;
        }
        if (b==y){
            strike+=1;
        } else if (a==x||c==d) {
            balls+=1;

        }
        if(c==d){
            strike+=1;
        } else if (a==x||b==y) {
            balls+=1;
        }
        System.out.println(strike+"S"+balls+"B");
    }
}

//problem 9 from ch5