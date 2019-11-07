
class Task4{
public static float average(int a[]){
 	float avg=0;
   for (int i=0;i<a.length ;i++ ) {
   avg+=a[i];	
   }
   return (avg/a.length);
}
public static void main(String args[]){
int arr[]={1,2,3,4};

 System.out.print("Average="+average(arr)); 
}
}