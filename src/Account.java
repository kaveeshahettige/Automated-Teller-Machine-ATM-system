
public class Account {

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
