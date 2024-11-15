/* the time complexity of the linear search is O(n) which is not good but
 * it is beginner friendly 
 */

class A {
  int lns(int a[], int target) {
      for (int i = 0; i < a.length; i++) {
          if (a[i] == target) {
              return i;
          }
        
      }
      return -1;
  }

  public static void main(String[] args) {
      A obj = new A();
      int a[] = {1, 2, 3, 4, 5, 6, 7};
      int target = 4;
    
      int r = obj.lns(a, target);
      System.out.println(r);
  }
}
