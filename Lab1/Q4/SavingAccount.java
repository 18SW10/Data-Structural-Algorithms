class SavingAccount extends Account{
	private double defaultInterestRate=2.5;
	private double interestRate=1.5;
	public double setDefaultInterestRate(){
		double interestRate=this.interestRate;
		return interestRate;
		}
	public double applyMonthlyInterest(){
		double Interest=super.balance()+interestRate;
		return Interest;
		}
	}