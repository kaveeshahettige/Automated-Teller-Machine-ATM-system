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
				System.out.println("Your new balance is: "+this.checkingBalance+"\n");
			}

		}	
	}
	
	public void depositMoneyC() {

		System.out.print("Enter the amount you want to deposit: ");
		double amount=scanner.nextDouble();
		this.checkingBalance+=amount;
		System.out.println("You have successfully deposited "+amount+" to your account.");
		System.out.println("Your current account balance is "+this.checkingBalance+" .\n");
	}
	
	public void viewBalanceS() {
		System.out.println("Savings Account Balance: " + savingBalance);
	}
	
	public void withdrawMoneyS() {
		if(this.savingBalance<=0){
			System.out.println("You have insufficient funds to withdraw.");
		}else{
			System.out.print("Enter the amount you want to withdraw: ");
			double amount=scanner.nextDouble();
			if(this.savingBalance-amount<0){
				System.out.println("You have insufficient funds to withdraw.");	
			}else{
				this.savingBalance-=amount;
				System.out.println("You have successfullu withdrawn "+amount+" from your account.");
				System.out.println("Your new balance is: "+this.savingBalance+"\n");
			}
		}
		
	}
	
	public void depositMoneyS() {
		System.out.print("Enter the amount you want to deposit: ");
		double amount=scanner.nextDouble();
		this.savingBalance+=amount;
		System.out.println("You have successfully deposited "+amount+" to your account.");
		System.out.println("Your savings account balance is "+this.savingBalance+" .\n");
		
	}
	

}
