package Practice.method;

public class Find_min {
    public static void main(String[] args) {

        int a =45;
        int b =90;
        int c =99;
        int d=98;
        int min;
       min = getmin(a,b);

        System.out.println("minimum of a and b is :"+min);

        min = getmin(c,d);

        System.out.println("minimum of c and d is :"+min);
    }
    public static int getmin(int a,int b){
        int min;
        if(a>b){
            min = b;
        }
        else{
            min =a;
        }
        return min;
    }
}
