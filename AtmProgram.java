package practise;

import java.util.Scanner;

public class AtmProgram {
public static void main(String[] args) {
	
	int balance=10000,deposit,withdrawal;
	Scanner sc = new Scanner (System.in);
	
	while (true) {
		System.out.println("Welcome to our ATM");
		System.out.println("Press 1 for Balance enquiry");
		System.out.println("Press 2 for Cash Withdrawal");
		System.out.println("Press 3 for Deposit");
		System.out.println("Press 4 for Exit");
		System.out.println("Choose the option to perform");
		
		int a = sc.nextInt();
		
		
		switch(a) {
		case 1:
			System.out.println("Balance amount :");
			System.out.println(balance);
			break;
		case 2 :
			System.out.println("Enter amount to be withdrawed:");
			withdrawal = sc.nextInt();
			if (balance > withdrawal ) {
				balance = balance - withdrawal;
				System.out.println("Amount withdrawed");
				System.out.println("Balance amount: "+balance);
			}
			else {
				System.out.println("Insufficient Balance");
			}
			break;
		case 3:
			System.out.println("Enter amount to be deposited");
			deposit = sc.nextInt();
			balance = balance + deposit;
			System.out.println("Amount Deposited : "+deposit);
			System.out.println("Balance: "+balance);
			break;
		
		case 4:
			System.exit(a);
			
		}
		
	}
	
	
}
}
