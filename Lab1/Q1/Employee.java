import java.util.*;
class Employee{
	double salary;

	int hours;
Scanner sc=new Scanner(System.in);
void getInfo(){
System.out.print("Enter your salary in dollars:");
salary=sc.nextInt();

System.out.print("Enter number of hours of work per day:");
 hours=sc.nextInt();
}
double AddSal(){
	if(salary<500){
		salary+=10;
		}
		else
		salary=salary;
		return salary;
	}
double AddWork(){
	if(hours>6){
	   salary+=5;
		}
		else
		salary=salary;
		System.out.print("Final Salary="+salary+"\n");
		return salary;
	}
	public static void main(String args[]){
		Employee e=new Employee();
		e.getInfo();
		e.AddSal();
		e.AddWork();
		}
}

