package com.learning.main;

import java.util.Scanner;

import com.greatlearning.model.Customer;
import com.greatlearning.service.Banking;

public class BankingOperations {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		Customer customer1=new Customer(12345,"password");
		System.out.println("!!!Welcome to Indian Bank!!!");
		System.out.println("Please enter account no: ");
		int accountNumber=Integer.parseInt(scanner.nextLine());
		System.out.println("Please enter password: ");
		String password=scanner.nextLine();
		if(customer1.getBankAccountNumber()==accountNumber && customer1.getPassword().equals(password))
		{
			Banking banking=new Banking();
			int option;
			do
			{
				System.out.println("FOllowing Operations can be performed:");
				System.out.println("1. Deposit");
				System.out.println("2. Withdraw");
				System.out.println("3. Transfer");
				System.out.println("4. Logout");
				option =Integer.parseInt(scanner.nextLine());
				int amount;
				switch(option)
				{
				case 1: 
					System.out.println("Please enter an amount:");
					amount=scanner.nextInt();
					banking.deposit(amount);
					break;
				case 2: 
					System.out.println("Please enter an amount:");
					amount=scanner.nextInt();
					banking.withdraw(amount);
					break;
				case 3: 
					System.out.println("Please enter an account number:");
					int trnsfAccNumber=Integer.parseInt(scanner.nextLine());
					System.out.println("Please enter an amount:");
					amount=Integer.parseInt(scanner.nextLine());
					banking.transfer(amount, trnsfAccNumber);
					break;
				case 4: 
					option=-1;
					break;
				}
			}while(option!=-1);
			
			System.out.println("Thankyou. Transactions Completed.");		
		}
		else
		{
			System.out.println("Invalid credentials!!!");
		}
	}

}
