import java.util.Scanner;
// problem 4 ch4
public class Main {
    public static void main(String[] args) {

        int number,result;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your number to round thousands edge like 16890 ~~17000");
        number=input.nextInt();
        result= Math.round((number/1000)*1000);
        System.out.println(result);




    }
}