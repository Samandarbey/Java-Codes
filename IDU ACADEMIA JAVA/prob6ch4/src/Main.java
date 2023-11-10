import java.util.Scanner;
// problem 6 ch4
public class Main {
    public static void main(String[] args) {

        int radius;
        double pi=3.14;
        float length, surface;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the radius of your circle: ");
        radius= input.nextInt();

//        length=2*pi*radius;
        System.out.println("Result of length: "+Math.round((2*pi*radius )*10)/10);
        System.out.println("Surface: "+ pi*(radius*radius));


    }
}