class Recursion{
    public static void printnumbers(int i) {
        if (i <= 5) {
            System.out.println(i + " ");
            printnumbers(i+1);  //why it doesnt work with i++
        }
    }
    public static void main(String args[]){
        printnumbers(1);
    }
}