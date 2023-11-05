import java.util.Scanner;
import java.text.*;
public class main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your buying price per share: ");
        double buyingPrice=input.nextDouble();
        int day=1;
        double clothingPrice = 0.1;
        DecimalFormat df=new DecimalFormat("0.00");
        while (true) {
            System.out.println("Enter the closing price for day:  " +
                    day + " any negative value to leave: ");
            clothingPrice = input.nextDouble();
            if (clothingPrice < 0.0) break;
            double earnings = clothingPrice - buyingPrice;
            if (earnings > 0) {
                System.out.println("After day " + day + " you earned " + df.format(earnings)  + " per share ");

            }
            else if(earnings<0.0){
                System.out.println("After day "+ day  + ",  you lost "+df.format(-earnings) + " per share");

            }
            else{
                System.out.println("After day "+ day + ", you have "+"no earning per share! ");
            }
            day+=1;

//            scan.close();
        }

    }
}

