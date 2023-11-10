import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("1 for problem 4" +
                "2 for problem 9" +
                "3 for problem 10");
        System.out.println("Enter the number between 1-3 to review your tasks:");
        int get= input.nextInt();
        if (get<=3&&get>=1){
            if (get==1){
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

            } else if (get==2) {
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
            else{
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
        else{
            System.out.println("Please, enter the number between 1-3");
        }
        System.out.println("Thanks! ");
    }
}

// problem 12 from ch5