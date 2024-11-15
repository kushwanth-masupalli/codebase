public class Solution {
    public static int binarySearch(int[] array, int target, int left, int right) {
        if (left <= right) {
            int mid = left + (right - left) / 2;

          
            if (array[mid] == target) {
                return mid;
            }

         
            if (array[mid] > target) {
                return binarySearch(array, target, left, mid - 1);
            }

            return binarySearch(array, target, mid + 1, right);
        }

   
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 4, 10, 40};
        int target = 10;

        int index = binarySearch(array, target, 0, array.length - 1);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
