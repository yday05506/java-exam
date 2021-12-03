//1106 양다연
package EXAM2;

public class BankAccountEX2_1106 {

	public static void main(String[] args) {
		BankAccount mjl = new BankAccount();
		BankAccount your = new BankAccount();
		mjl.initAccount("12-34-567", "진달래", 10000);
		your.initAccount("21-43-765", "개나리", 12000);
		mjl.chkMyBalance();
		your.chkMyBalance();
		
		mjl.deposit(5000);
		your.deposit(7000);
		mjl.chkMyBalance();
		your.chkMyBalance();
		
		your.withdraw(3000);
		mjl.withdraw(2000);
		mjl.chkMyBalance();
		your.chkMyBalance();
	}

}

class BankAccount {
	String Acc_num;
	String name;
	int balance;
	
	void initAccount (String num, String na, int bal) {
		Acc_num = num;
		name = na;
		balance = bal;
	}
	
	int deposit(int money) {
		return balance += money;
	}
	
	int withdraw(int money) {
		return balance -= money;
	}
	
	void chkMyBalance() {
		System.out.println("-------------------------------------------------");
		System.out.println("계좌번호 : " + Acc_num);
		System.out.println("이름 : " + name);
		System.out.println("잔액 : " + balance);
		System.out.println("-------------------------------------------------");
	}
}