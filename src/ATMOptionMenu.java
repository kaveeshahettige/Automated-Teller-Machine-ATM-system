import java.util.HashMap;
import java.util.Scanner;

public class ATMOptionMenu extends Account{
	HashMap<Integer,Integer> data=new HashMap<Integer,Integer>();
	Scanner scanner=new Scanner(System.in);
	
	public void login() {
		data.put(12345, 12213443);
		data.put(67890, 67768998);
		
		int x=1;
		
		do {
		try {
			System.out.println("\nWelcome to the ATM Machine!");
			System.out.print("Enter your account number : ");
			setAccNum(scanner.nextInt());
			
			System.out.print("Enter your pin number : ");
			setPinNum(scanner.nextInt());
			
		}catch(Exception e) {
			System.out.println("Error occured: "+e);
			x=2;
		}
		
		int an=getAccNum();
		int pn=getPinNum();
		//checkAccType();
		
		if(data.containsKey(an) && data.get(an)==pn) {
			checkAccType();
		}else {
			System.out.println("Sorry, incorrect account number or pin number.\n");
		}
		
		}while(x==1);
			
	}
	
	public void checkAccType() {
		System.out.println("\nEnter your account type, ");
		System.out.println("Press 1 for Checking account, ");
		System.out.println("Press 2 for Savings account, ");
		System.out.println("Press 3 to exit, ");
		System.out.print("Choice : ");
		
		int accType=scanner.nextInt();
		switch(accType) {
		case 1: getChecking();
		break;
		case 2: getSaving();
		break;
		case 3: System.out.println("Thank you for using ATM! Good Bye.\n");
		break;
		default:System.out.println("Invalid Choice.");
		}
		
	}
	
	public void getChecking() {
		System.out.println("\nChecking Accoount");
		System.out.println("Press 1 for View Balance");
		System.out.println("Press 2 for Withdraw Funds");
		System.out.println("Press 3 for Deposit Funds");
		System.out.println("Press 4 to exit");
		System.out.println("Choice : ");
		
		int checkingres=scanner.nextInt();
		
		switch(checkingres) {
		case 1:viewBalanceC();
		break;
		case 2:withdrawMoneyC();
		break;
		case 3:depositMoneyC();
		break;
		case 4: System.out.println("Thank you for using ATM! Good Bye.\n");
		break;
		default:System.out.println("Invalid Choice.");
		
		}
	}
	
	public void getSaving() {
		
		System.out.println("\nSavings Accoount");
		System.out.println("Press 1 for View Balance");
		System.out.println("Press 2 for Withdraw Funds");
		System.out.println("Press 3 for Deposit Funds");
		System.out.println("Press 4 to exit");
		System.out.println("Choice : ");
		
		int checkingres=scanner.nextInt();
		
		switch(checkingres) {
		case 1:viewBalanceS();
		break;
		case 2:withdrawMoneyS();
		break;
		case 3:depositMoneyS();
		break;
		case 4: System.out.println("Thank you for using ATM! Good Bye.\n");
		break;
		default:System.out.println("Invalid Choice.");
		
		}
		
	}

}
