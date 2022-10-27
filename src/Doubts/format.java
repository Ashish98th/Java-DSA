package Doubts;

//Q)Print the multiplication table of a number n.
//D:What is format specifier?


public class format{
    static  void multiplication(int n){
        for(int i=1;i<=10;i++){
            System.out.format("%d x %d\n",n,i,n*i);
        }
    }

    public static void main(String[] args) {
        multiplication(7);
    }

}

