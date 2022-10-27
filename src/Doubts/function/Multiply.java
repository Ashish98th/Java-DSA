

//Qs. Write a function to multiply 2 numbers.



import java.util.*;
public class Multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        multiplying(a,b);  //calling the function
        System.out.println(multiplying(a,b));
    }

    public static int multiplying(int a,int b){
        int multiplication = a*b;
        // return multiplication;
        return multiplication;
    }
}

////Q)The return statement


//import java.util.*;
//
//public class Functions {
//
//    //Multiply 2 numbers
//    public static int multiply(int a, int b) {
//        return a*b;
//    }
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        int result = multiply(a, b);
//        System.out.println(result);
//    }
//}
