package Doubts;

import java.util.Scanner;
class Find_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        char target = 'u';
        Search(name,target);

    }

    static boolean Search(String name, char target) {
        if(name.length()==0){
            return false;

        }
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)==target){
                return true;
            }
        }
        return false;
    }
}

//DQ)Why this error?