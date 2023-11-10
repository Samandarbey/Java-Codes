import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your score from exam: ");
        int ball= input.nextInt();
        if (ball<60){
            System.out.println("Fail!");
        } else if (ball<60&&ball<80) {
            System.out.println("C");
        } else if (ball>80&&ball<90) {
            System.out.println("B");
        } else if (ball>90&&ball<100) {
            System.out.println("A");
        }
        else {
            System.out.println("Enter valuable score, please!");
        }
    }
}

// Task name: Marking