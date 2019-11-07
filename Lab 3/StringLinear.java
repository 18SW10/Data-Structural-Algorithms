import java.util.*;
class StringLinearSearch{
public static void linearSearch(String[]arr,String target){
int j=0;
int i;
for(i=0;i<arr.length;i++){
		if(arr[i]==target){
			j=1;
			break;
		}
	

}
 if(j==1){
 	System.out.println("element found at index "+(i));
 }
 else{
 	System.out.println("Element not found.");
 }
}
public static void main(String args[]){
     String array[]={"bananas","apples","mangoes"};
   String t="apples";
   int ta=10;
   linearSearch(array,t);
   linearSearch(array,"pineapple");
  // linearSearch(array,ta);
}

}