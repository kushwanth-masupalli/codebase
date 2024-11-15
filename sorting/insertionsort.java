public class insertionsort {
      void iss(int[] a) {
          for (int i = 1; i < a.length; i++) {
              int key = a[i];
              int j = i - 1;
  
              // Move elements of a[0..i-1] that are greater than key
              // to one position ahead of their current position
              while (j >= 0 && a[j] > key) {
                  a[j + 1] = a[j];
                  j--;
              }
              a[j + 1] = key; // Place key in its correct position
          }
  
          // Print sorted array
          for (int k = 0; k < a.length; k++) {
              System.out.println(a[k]);
          }
      }
  
      public static void main(String[] args) {
          insertionsort o = new insertionsort();
          int[] a = {5, 0, 4, 3, 2, 1, 49849845};
          o.iss(a);
      }
  }
  