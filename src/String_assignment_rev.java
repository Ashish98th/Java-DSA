import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();


        for(int i = word.length()-1;i>0;i--){
            System.out.print(word.charAt(i));
        }
    }

}