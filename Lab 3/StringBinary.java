class StringBinarySearch{
	public static int BinarySearch(String array[],String target){
      int l=0;
      int u=array.length-1;
     
      while(l<=u){
      	int m=(l+u-1)/2;
            int r=target.compareTo(array[m]);
      	if(r==0){
      		return m;
      	}
      		if(r>0){
      			l=m+1;
      		}
      	 else{
      			u=m-1;
             }
      		}
   
      
      return -l-1;
     }
	public static void main(String args[]){
		 String array[]={"kiwi","apples","bananas","mangoes"};
               String target="apples";
		System.out.print("Element found at index "+BinarySearch(array,target));
		//System.out.print("Element found at index "+BinarySearch(array,"pineapples"));
	}
}