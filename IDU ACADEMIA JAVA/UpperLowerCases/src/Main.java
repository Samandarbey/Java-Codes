import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// upper and lower case tasks
        String UpperWord;
        String LowerWord;
        Scanner input=new Scanner(System.in);
        //String words;
        System.out.println("Enter your words to convert all into Upper Case:  ");
        String words=input.next();
        System.out.println("Enter your words to convert all into Lower Case:  ");
        UpperWord = words.toUpperCase();
        String words1=input.next();
        LowerWord = words1.toLowerCase();
        System.out.println("Results: ");
        System.out.println(UpperWord);
        System.out.println(LowerWord);


    }
}