import java.util.*;
class Area{
	Scanner sc=new Scanner(System.in);
	double length,breadth,area;
	Area(){
		 System.out.print("Enter length:");
		 length=sc.nextInt();

		 System.out.print("Enter breadth:");
         breadth=sc.nextInt();
         }
        double returnArea(){
			   area=length*breadth;
			   return area;
	   }
	 public static void main(String args[]){
		   		Area e=new Area();
		   		System.out.print("area="+e.returnArea());
		}
	}