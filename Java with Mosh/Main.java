import java.util.Date;

public class Main {
    public static void main(String[] args) {
        int age =30;
        int herAge=age;
        System.out.println(herAge);
        Date now= new Date();
        System.out.println(now);
        final int myAge=1234567;
        System.out.println(myAge);
        long number=8582378956359837658L;
        float number1=3244.324f;
        double number2=47.298392D;

        char myGrade='A';
        System.out.println(myGrade);
        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);
        int myNum=324;
        double muNUM=myNum;
        System.out.println(myNum);
        System.out.println(muNUM);
        double sunmebr=3245.454d;
        int myInt = (int) sunmebr;
        System.out.println(myInt);
        System.out.println(sunmebr);
        String txt="udsgisgfiugigfiwgeigiwef hello";
        System.out.println(txt.length());
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        System.out.println(txt.indexOf("hello"));

        System.out.println(Math.max(5,10));
        System.out.println(Math.min(5,10));

        System.out.println(Math.sqrt(100));
        System.out.println(Math.abs(-213.3243));

        int randomNum = (int) (Math.random()*101);
        System.out.println(randomNum);

        int i=0;
        do{
            System.out.println(i);
            i++;
        }
        while(i<5);

        for (int x=0; x>10; x++){
            System.out.println(x);
        }
        String[] cars = {"Volvo", "BMW", "Ford"};
        for
        (String n :
                cars
        ) {
            System.out.println(n);
        }

        String[] car = {"malibu","lexus","kia"};
        int[] numbers={213,132,213,234,132,213};
        System.out.println(car[0]);
        System.out.println(car[2]);
        System.out.println(car.length);
    }
}