import java.util.Scanner;

public class typecasting {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);


        String name = sc.next();
        String name1 = sc.next();

        // Typecasting

        int number = Integer.parseInt(name);
        int number1 = Integer.parseInt(name1);

        int sumOfTwo = number+number1;


        System.out.println(sumOfTwo);

        //typecasting double to int

        double pi = 3.14;
        int pivalue =(int) pi;

        System.out.println(pivalue);
    }
}
