class CharBinarySearch{
  public static int BinarySearch(char array[],char target){
      int l=0;
      int u=array.length-1;
     
      while(l<=u){
        int m=(l+u)/2;
        if(array[m]==target){
          return m;
        }
          if(array[m]<target){
            l=m+1;
          }
         if(array[m]>target){
            u=m-1;
          }
   
      }
      return -l-1;
     }
  public static void main(String args[]){
    char array[]={'a','b','c','d','e'};
    
    System.out.println("Element found at index "+BinarySearch(array,'c'));
    System.out.println("Element found at index "+BinarySearch(array,'f'));
     
  }
}