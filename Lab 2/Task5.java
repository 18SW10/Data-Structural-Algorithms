import java.util.*;
class Task5{
	public static int check(){
		Scanner s=new Scanner(System.in);
		int []arr=new int[50];
		int large=arr[0];
		int sec=arr[0];
		int index=0;
		System.out.print("Enter size of array:");
        int size=s.nextInt();
        System.out.print("Enter elements of array:");
        for (int i=0;i<size ;i++ ) {
        	arr[i]=s.nextInt();
        }
         for (int i=0;i<size ;i++ ) {
        	if(arr[i]>large){
        		sec=large;
        		large=arr[i];
        	}
        	else if (arr[i]>sec) {  
        		sec=arr[i];
        	}

        }
        for(int i=0;i<size;i++){
        	if(arr[i]==sec){
        		index=i;
        	}

        }
         
        return index;
        }

	
	public static void main(String[] args) {
		System.out.print("Index of Second largest elements is "+check());
	}
}