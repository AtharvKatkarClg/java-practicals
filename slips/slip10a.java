/*
Design a class for Bank. Bank Class should support following operations;
a. Deposit a certain amount into an account
b. Withdraw a certain amount from an account
c. Return a Balance value specifying the amount with details
*/

class Bank {
	int acc, bal;
	
	void deposit(int cash){
		bal = bal + cash;
	}
	
	void withdraw(int cash){
		if(bal > cash){
			bal = bal - cash;
			System.out.println(cash +  " with drawed");
		} else {
			System.out.println("Insufficient balance");
		}
	}
	
	
}

class slip10a {
	
}
