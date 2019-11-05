import java.util.*;
class Area{
	Scanner sc=new Scanner(System.in);
	double length,breadth,area;
     void setDim(){
		 System.out.print("Enter length:");
		 length=sc.nextInt();

		 System.out.print("Enter breadth:");
         breadth=sc.nextInt();
		 }
   double getArea(){
	   area=length*breadth;
	   return area;
	   }
	   public static void main(String args[]){
	   		Area e=new Area();
	   		e.setDim();


	   		System.out.print("area="+e.getArea());
		}
	}