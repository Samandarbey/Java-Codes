import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Americano -> W500" +
                "Caffe Latte -> W400" +
                "Lemon Tea -> W300");
        System.out.println("This is a list of our products: ");
        int money;
        int americano=500, latte=400, lemonTea=300;
        System.out.println("How much money do you have? :");
        money=input.nextInt();
        System.out.println("You can buy: ");
        System.out.println( money/americano + " Americano");
        System.out.println((money%americano)/latte + " Latte");
        System.out.println(((money%americano)/latte)%lemonTea +" Lemon Tea");

    }
}

//problem 11 from ch5