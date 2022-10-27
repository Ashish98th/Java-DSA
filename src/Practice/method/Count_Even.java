package Practice.method;

import java.util.Scanner;

public class Count_Even {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();

        int arr[] =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();

        }
        System.out.println(counteven(arr));


    }
    public static int counteven(int arr[]){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
