

//Q)Find the largest number from three numbers

package Doubts.Conditionals;

import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    if(a>b && a>c){
        System.out.println(a+" is largest");
    }
    else if(a>b && b>c){
        System.out.println(b+" is largest");
    }else {
        System.out.println(c+" is largest");
    }
    }
}

//package A98package.Conditionals;
//        import java.util.*;
//public class Largest {
//    static Scanner sc = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//
//        int max=a;
//        if(b>max){
//            max=c;
//        }
//        if(c>max){
//            max=c;
//        }
//        System.out.println(max);
//    }
//}
