public class SubSetsum {
    public static void main(String[] args) {
        int [] arr = {2,1,3};
        printSums(arr,0,0);
    }

    public static void printSums(int [] arr, int i , int sum){
        if(i==arr.length){
            System.out.print(sum+" ");
            return ;
        }

        printSums(arr, i+1, sum+arr[i]);
        printSums(arr, i+1,sum);

    }
}
