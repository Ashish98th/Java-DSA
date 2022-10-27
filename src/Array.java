class Array{
    public static void main(String args[]){
        int arr[] = new int[5];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

      //   didnt understand the " " marks that were used in below line
        System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);

        // what does the below line mean
        System.out.println(arr);
        System.out.println();

        int n = 5;
        for(int i=0;i<n;i++){
             System.out.println(arr[i]+" ");
        }
    }
}