public class quicksort {
    public void qs(int arr[], int l, int h) {
        if (l < h) {
            int n = partition(arr, l, h);
            qs(arr, l, n - 1);
            qs(arr, n + 1, h);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int l = low + 1;
        int h = high;
        while (l <= h) {
            while (l <= h && arr[l] < pivot) {
                l++;
            }
            while (l <= h && arr[h] > pivot) {
                h--;
            }
            if (l < h) {
                
                int temp = arr[l];
                arr[l] = arr[h];
                arr[h] = temp;
            }
        }
        
      
        int temp = arr[low];
        arr[low] = arr[h];
        arr[h] = temp;
        
        return h;
    }

    public static void main(String[] args) {
        quicksort s = new quicksort();
        int[] arr = {99,1001,2,23,445};
        s.qs(arr, 0, arr.length - 1);
        
       
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
