package com.corejava;

public class Bankaccount {
	static int Accountnogen;
	int accountno;
	String accountholder;
	double balance;
	{
		accountno=Accountnogen++;
	}

	public static void main(String[] args) {
		Bankaccount s= new Bankaccount();
		
		s.accountno=25644;
		s.accountholder="swami";
		s.balance=5000;
		System.out.println("accountno:-" +s.accountno);
		System.out.println("accounthouler:-" +s.accountholder);
		System.out.println("balance:-" +s.balance);
		
		

	}

}
