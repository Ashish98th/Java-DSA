public class Recursion_factorial {
    public static int factorial(int n){
        if(n<=1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    public static void main(String args[]){
        int n = 5;
        int ans = factorial(n);
        System.out.println(ans);   //how 120 is getting printed here
    }
}
//5*4*3*2*1   //
//5*4!
//4*3!
//3*2!
//2*1!
//
//        5*24 = 120
//        4*6 =24
//        3*2 = 6
//        2*1 = 2