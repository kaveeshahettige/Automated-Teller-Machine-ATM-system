import java.util.Scanner;

public class Account {
	Scanner scanner=new Scanner(System.in);

	private int accountNumber;
	private int pinNumber;
	private double checkingBalance = 0;
	private double savingBalance = 0;
	
	public void setAccNum(int accnum) {
		this.accountNumber=accnum;
	}
	
	public void setPinNum(int pinnum) {
		this.pinNumber=pinnum;
		
	}
	
	public int getAccNum() {
		return this.accountNumber;
	}
	
	public int getPinNum() {
		return this.pinNumber;	
	}
	
	public void viewBalanceC() {
		System.out.println("Checking Account Balance: " + checkingBalance);
	}
	
	public void withdrawMoneyC() {

		if(this.checkingBalance<=0){
			System.out.println("You have insufficient funds to withdraw.");
		}else{
			System.out.print("Enter the amount you want to withdraw: ");
			double amount=scanner.nextDouble();
			if(this.checkingBalance-amount<0){
				System.out.println("You have insufficient funds to withdraw.");	
			}else{
				this.checkingBalance-=amount;
				System.out.println("You have successfullu withdrawn "+amount+" from your account.");
				System.out.println("Your new balance is: "+this.checkingBalance);
			}

		}	
	}
	
	public void depositMoneyC() {
		
	}
	
	public void viewBalanceS() {
		System.out.println("Savings Account Balance: " + savingBalance);
	}
	
	public void withdrawMoneyS() {
		
	}
	
	public void depositMoneyS() {
		
	}
	

}
