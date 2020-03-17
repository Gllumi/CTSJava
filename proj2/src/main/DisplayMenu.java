package main;

import java.sql.SQLException;
import java.util.Scanner;
import dao.AccountDao;
import dao.UserDao;
import dto.Accounts;
import dto.Users;


public class DisplayMenu {
	public static void existingUser() throws SQLException {
		UserDao userdao = new UserDao("jdbc:mysql://localhost:3306/cts","root","root");
		AccountDao ad = new AccountDao("jdbc:mysql://localhost:3306/cts","root","root");
		Scanner sc = new Scanner(System.in);
		System.out.println("Bank Customer Application");
		System.out.println("Enter User name");
		String uname = sc.next();
		System.out.println("Enter password");
		String pwd = sc.next();
		Users user = new Users(uname,pwd);
		
		System.out.println("Enter Account Number");
		String ac = sc.next();
		Accounts acc= new Accounts(ac);
		int stat = ad.checkAccount(acc);
		
		int status = userdao.checkUser(user);
		if(status==1 && stat == 1) {
			 
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Check Balance");
			int x = sc.nextInt();
			switch(x) {
			case 1:System.out.println("Enter the amount");
				float x1=sc.nextInt();  
				ad.deposit( x1, ac);
				break;
			default : System.out.println("choose Something");	
			}
		}
		else
			System.out.println("Invalid user...");
		
		userdao.disconnect();
		ad.disconnect();
		
	}
	public static void newUser() throws SQLException {
		UserDao userdao = new UserDao("jdbc:mysql://localhost:3306/cts","root","root");
		Scanner sc = new Scanner(System.in);
		System.out.println("you have to register first...");
		System.out.println("Enter username");
		String uname = sc.next();
		System.out.println("Enter password");
		String pwd = sc.next();
		Users user = new Users(uname,pwd);
		System.out.println("Enter AccountNumber");
		String acctNumber = sc.next();
		System.out.println("Enter AccountType");
		String acctType = sc.next();
		System.out.println("Enter Customer Name");
		String custName = sc.next();
		System.out.println("Enter the amount");
		float balance = sc.nextFloat();
		Accounts accounts = new Accounts(acctNumber,custName,acctType,balance);
		UserDao.createCustomer(accounts, user);
		
	}
	public void showMenuOptions() throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("***************Bank Application ************");
		System.out.println("1.New User...");
		System.out.println("2.Existing User...");
		System.out.println("Enter your choice...");
		int choice= sc.nextInt();
		switch(choice) {
		case 1: newUser();break;
		case 2: existingUser();break;
		default: System.out.println("Wrong Choice...");
		}
		
	}

}