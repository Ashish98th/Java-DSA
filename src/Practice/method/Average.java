//2. Write a Java method to compute the average of three numbers. Go to the editor
//        Test Data:
//        Input the first number: 25
//        Input the second number: 45
//        Input the third number: 65
//        Expected Output:
//
//        The average value is 45.0

package Practice.method;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double num1 = sc.nextDouble();
    double num2 = sc.nextDouble();
    double num3 = sc.nextDouble();

    computeavg(num1,num2,num3);  //calling a function
    }
    static void computeavg(double num1,double num2,double num3){      //function
        double avg =(num1+num2+num3)/3;
        System.out.println(avg);
    }
}








//import java.util.Scanner;
//public class Exercise2 {
//
//    public static void main(String[] args)
//    {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input the first number: ");
//        double x = in.nextDouble();
//        System.out.print("Input the second number: ");
//        double y = in.nextDouble();
//        System.out.print("Input the third number: ");
//        double z = in.nextDouble();
//        System.out.print("The average value is " + average(x, y, z)+"\n" );
//    }
//
//    public static double average(double x, double y, double z)
//    {
//        return (x + y + z) / 3;
//    }
//}
