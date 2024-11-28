public class bubblesort {

    void bs(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int k = 0; k < a.length; k++) {
            System.out.println(a[k]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {36, 2, 67, 3, 1, 7};
        bubblesort o1 = new bubblesort();
        o1.bs(arr);
    }
}

/*it is not an efficient way of  sorting the actual time complexity is
 * n**2 which we know not good 
 * 
 * but in the best case we can reduce the time complexity to o(n) by introducing a flag in between them
 * but easy to understand for a beginner 
 */
