import java.util.*;
class CharLinearSearch{
public static void linearSearch(char[]arr,char target){
int j=1;
for (int i:arr ) {
	if(j>=arr.length){
		System.out.println("element not found.");
	}
	else{
		if(arr[j]==target){
			System.out.println("Element found at index "+j);
			break;
		}
       else{
       	j++;
       	continue;
       }    
	}
}

}
public static void main(String args[]){
     char array[]={'a','b','c'};
   char t='b';
   int ta=10;
   linearSearch(array,t);
  // linearSearch(array,ta);
}

}