import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int leapYear;
        System.out.println("Enter the year: ");
        leapYear=input.nextInt();
        if (leapYear%4==0){
            System.out.println();
            if (leapYear%100==0){
                if (leapYear%400==0){
                    System.out.println("Leap Year");
                }
                else{
                    System.out.println("Normal year");
                }
            }
            else {
                System.out.println("Leap Year");
            }

        }
        else{
            System.out.println("Normal Year");
        }
    }
}

//problem 6 from ch5