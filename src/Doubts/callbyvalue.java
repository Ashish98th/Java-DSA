package Doubts;

public class callbyvalue {
    public static void main(String[] args) {
        int num=55;
        System.out.println(num);
        change(num);
        System.out.println(num);
    }

    static void change(int num) {

        num = 99;
    }
}

//D:why the value doesnt ccahnge?