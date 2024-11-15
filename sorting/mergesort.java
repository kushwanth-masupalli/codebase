public class mergesort{
     public void ms(int [] arr,int l , int r){
         if(l<r){
             int mid = (l+r)/2;
             ms(arr,l,mid);
             ms(arr,mid+1,r);
             merge(arr,l,r,mid);
         }
     }

     public static void merge(int [] arr,int l, int r,int mid){
            int n1 = mid-l+1;
            int n2 = r-mid;

            int [] la = new int[n1];
            int [] ra = new int[n2];

            for(int i=0;i<n1;i++){
                la[i]=arr[l+i];
            }
            for(int i=0;i<n2;i++){
                ra[i]=arr[mid+1+i];
            }

            int il =0;
            int ir = 0;
            int k = l;
            while(il<n1 && ir<n2){
                if(la[il]<ra[ir]){
                    arr[k]=la[il];
                    il++;
                    
                }
                else{
                    arr[k]=ra[ir];
                    ir++;
                
                }       
                k++;
            }

            while (il < n1) {
                arr[k] = la[il];
                il++;
                k++;
            }
    
            while (ir < n2) {
                arr[k] = ra[ir];
                ir++;
                k++;
            }

     }

     public static void main(String[] args) {
        mergesort o = new mergesort();
        int[] arr = {65, 3, 266, 4, 33, 22, 356};

        o.ms(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.println(i);
        }
    }


}