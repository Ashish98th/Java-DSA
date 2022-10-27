//1. Write a Java method to find the smallest number among three numbers. Go to the editor
//        Test Data:
//        Input the first number: 25
//        Input the Second number: 37
//        Input the third number: 29
//        Expected Output:
//
//        The smallest value is 25.0
//

package Doubts;

import java.util.*;
import java.lang.*;
//import java.lang.Math;
public class smallestvalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        findtheminvalue(num1,num2,num3);
    }
    static void findtheminvalue(double num1,double num2,double num3){
        double minoftwonumbers = Math.min(num1,num2);
        double minofthreenumbers = Math.min(minoftwonumbers,num3);
        System.out.println(minofthreenumbers);


    }
}
//D:Error in line 15



//Solution:
//import java.util.Scanner;
//public class Exercise1 {
//
//    public static void main(String[] args)
//    {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input the first number: ");
//        double x = in.nextDouble();
//        System.out.print("Input the Second number: ");
//        double y = in.nextDouble();
//        System.out.print("Input the third number: ");
//        double z = in.nextDouble();
//        System.out.print("The smallest value is " + smallest(x, y, z)+"\n" );
//    }
//
//    public static double smallest(double x, double y, double z)
//    {
//        return Math.min(Math.min(x, y), z);
//    }
//}