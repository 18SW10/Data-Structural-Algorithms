import java.util.*;
class Account{
	Scanner sc=new Scanner(System.in);
	double balance(){
		System.out.print("Enter amount you want to deposit:");
		 double deposits=sc.nextInt();
		System.out.print("Enter amount you want to withdraw:");
		 double withdraw=sc.nextInt();
		return (deposits-withdraw);
		}
	}