import java.util.Scanner;
//problem 2
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sec,min,hour,second;
        System.out.println("Enter the value for seconds: ");
        sec= input.nextInt();
//        min=input.nextInt();
//        hour= input.nextInt();
        hour=sec/3600;
        min=sec%3600;
        second=min%60;
        System.out.println(hour+":"+min+":"+second);


    }
}