import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Fibanachi numbers homework
        Scanner input = new Scanner(System.in);
        int a,b,c;
        a=1;
        b=1;
        c=a+b;
        System.out.println("21 Fibanachi numbers: ");
        System.out.println("Number 1: " + a);  //1
        System.out.println("Number 2: "+b);    //1
        System.out.println("Number 3: "+c);     //2
        System.out.println("Number 3: "+(c+b));       //3
        System.out.println("Number 4:"+ (2*c+b));     //5
        System.out.println("Number 5: " + (3*c+2*b));   //8
        System.out.println("Number 6: "+(5*c+3*b));     //13
        System.out.println("Number 7: "+ (8*c+5*b));     //21
        System.out.println("Number 8: "+ (13*c+8*b));     //34
        System.out.println("That's more than enough! \uD83D\uDE01 ");

    }
}