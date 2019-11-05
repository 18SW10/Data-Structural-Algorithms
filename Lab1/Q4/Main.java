class Main{
	public static void main(String args[]){

	   SavingAccount s=new SavingAccount();
	   s.setDefaultInterestRate();
	  System.out.print("Interest monthly will be:"+s.applyMonthlyInterest());
		}
	}