import java.util.Arrays;
public class Task6 {
 public static void sort(int [][] array)
{
int x;
for(int i=0 ; i<array.length ; i++)
{
          for(int j=0 ; j<array[i].length ; j++ ){
          for(int k=0 ; k< array[i].length-j-1 ; k++){
          if(array[i][k]>array[i][k+1])
          {
          x=array[i][k];
          array[i][k]=array[i][k+1];
          array[i][k+1]=x;
          }
          }
}
}
}
public static void print(int [][] arr)
{
for(int i=0 ; i<arr.length ; i++)
{
for(int j=0 ; j<arr[i].length ; j++)
{
System.out.print(arr[i][j]+ " ");
}
System.out.println();
}
}
public static void main(String [] args)
{
int [][] arr={{1,9,6}  ,{ 2, 4, 5}  ,{3 ,7 , 8 }};
System.out.println(" new Length of array is "+arr.length );
sort(arr);
print(arr);
}
}