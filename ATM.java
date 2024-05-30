
import java.util.Scanner;

class Atm {
	float balance;
	int pin = 4567;
	public void checkpin() {
		System.out.println("enter your pin:");
		Scanner sc = new Scanner(System.in);
		int enterpin = sc.nextInt();
		if(enterpin==pin) {
			menu();
			
		}
		else {
			System.out.println("enter a valid pin"); 
		}

	}
	public void menu() {
		System.out.println("enter your choice:");
		System.out.println("1. check a/c balance");
		System.out.println("2. withdraw money");
		System.out.println("3. deposit money");
		System.out.println("4. exit");
		Scanner sc = new Scanner(System.in);
		int opt = sc.nextInt();
		if(opt==1) {
			checkbalance();
		}
		else if(opt==2) {
			withdrawmoney();
		}
		else if(opt==3) {
			depositmoney();
		}
		else if(opt==4) {
			return;
		}
		else
		{
			System.out.println("enter a valid choice");
			menu();
		}
	}
	public void checkbalance() {
		System.out.println("balance :" + balance);
		menu();
	}
	public void withdrawmoney() {
		System.out.println("enter amount to withdraw:");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
		if(amount>balance) {
			System.out.println("insufficient balance");
		}
		else {
			balance = balance-amount;
			System.out.println("money withdrawl successful");
		}
		menu();
		}
	public void depositmoney() {
		System.out.println("enter the amount:");
		Scanner sc = new Scanner (System.in);
		float amount = sc.nextFloat();
		balance = balance + amount;
		System.out.println("money deposited successfully");
		menu();
	}
	
}


public class atm {
	public static void main (String[] args) {
		Atm obj = new Atm();
		obj.checkpin();
	
		
	}

	}


