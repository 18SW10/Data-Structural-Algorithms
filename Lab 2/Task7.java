class Task7{ 
  
      public static int removeDuplicateElements(int[]arr,int n){
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
         if(n==0||n==1){
            return n;
         }
        temp[j++] = arr[n-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;
        
    }  
      public static void main (String[] args) {  
        int arr[] = {20,20,30,40,50,50,50};  
        int n = arr.length;  
        n = removeDuplicateElements(arr,arr.length);  
        //printing array elements  
        for (int i=0; i<n; i++)  
           System.out.print(arr[i]+" ");
            System.out.print("size of new array="+n);
              }
       
}  