package com.greatlearning.service;

import java.util.Scanner;

public class Banking {
	
	private double balance=1000;
	Scanner scanner= new Scanner(System.in);
	
	public void deposit(double amount)
	{
		if(amount>0)
		{
			balance+=amount;
			System.out.println(amount+" deposited successfully.");
			System.out.println("Current Balance: "+balance);
		}
		else
			System.out.println("Invalid Amount");
	}
	
	public void withdraw(double amount)
	{
		if(balance>=amount)
		{
			balance-=amount;
			System.out.println(amount+" withdrawn successfully.");
			System.out.println("Current Balance: "+balance);
		}
		else
		{
			System.out.println("Insufficient Balance!!!");
		}
	}
	
	public void transfer(double amount, int account)
	{
		System.out.println("Please enter the otp:");
		OTPGenerator og=new OTPGenerator();
		int generatedOtp=og.generateOTP();
		System.out.println("OTP: "+generatedOtp);
		int otp=scanner.nextInt();
		
		if(otp==generatedOtp)
		{
			if(balance>amount)
			{
				balance-=amount;
				System.out.println(amount+" transferred successfully to Account: "+account);
				System.out.println("Current Balance: "+balance);
			}
			else
			{
				System.out.println("Insufficient Balance!!!");
			}	
		}
		else
		{
			System.out.println("Invalid OTP!!!");
		}
	}
}
