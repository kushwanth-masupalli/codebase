public class selectionsort{
      void ss(int []a ){
            for(int i =0;i<a.length;i++){
                  int min = i;
                  for(int j =i+1;j<a.length;j++){
                        if (a[j]<a[min]){
                              min =j;
                        }
                        int temp = a[i];
                              a[i]=a[min];
                              a[min]=temp;
                  }
            }

            for(int k =0;k<a.length;k++){
                  System.out.println(a[k]);
            }
      }

      public static void main(String[] args) {
            selectionsort o1= new selectionsort();
            int []a = {11,1,2,22,55,88,8,88888};
            o1.ss(a);
      }
}