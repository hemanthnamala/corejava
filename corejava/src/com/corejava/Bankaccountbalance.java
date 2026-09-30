package com.corejava;

public class Bankaccountbalance {
static int Balance =1000;

static void deposit(int amount) {
	Balance+=amount;
	System.out.println("deposit amount ="+ Balance);
}
static void withdraw(int amount) {
	Balance-=amount;
	System.out.println("Withdraw amount ="+Balance);
}
 
	public static void main(String[] args) {
		deposit(500);
		withdraw(300);
		System.out.println("Final amount ="+Balance);

	}

}
