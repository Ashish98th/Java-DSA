package Doubts.Assignment;
import java.io.*;
import java.util.*;
public class Map {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();

        int ans=0;

        for(int i=0;i<n;i++){
            int num = scan.nextInt();
            if(hm.containsKey(num)){
                int count = hm.get(num);
                hm.put(num,count+1);
            }
            else{
                hm.put(num,1);
            }
        }
        //System.out.println(hm);
        int maxiFrq = 0, maxiNum = 0;
        for(int k:hm.keySet()){
            if(hm.get(k)>maxiFrq){
                maxiFrq = hm.get(k);
                maxiNum = k;
            }
        }

        System.out.println(maxiNum);

    }
}
