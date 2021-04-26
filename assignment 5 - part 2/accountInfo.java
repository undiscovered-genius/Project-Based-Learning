package assignment5;

import java.util.ArrayList;
import java.util.Scanner;

public class accountInfo{

	public static void main(String[] args) {
//		savingAcc acc1 = new savingAcc("Ayush",1234567891,3000.0,5000.0);
//		savingAcc acc2 = new savingAcc();

		int st=1,ch,count,check;
		String name;
		int accNum;
		boolean tt =true;
		double Bal,savBal,deposit,withdraw;
		ArrayList<savingAcc> customers = new ArrayList<savingAcc>();
		savingAcc temp = new savingAcc();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("------State Bank of India------\n\n");
		
		while(st == 1) {
			System.out.println("-------Menu--------");
			System.out.println("1. Create Account");
			System.out.println("2. Display User List");
			System.out.println("3. Display Account Information");
			System.out.println("4. Deposit Money");
			System.out.println("5. Withdraw Money");
			System.out.println("6. Delete Account");
			System.out.print("   Enter Choice (1-5) : ");
			ch = scan.nextInt();
			
			switch(ch) {
			case 1:
				System.out.print("   Enter Name : ");
				name = scan.next();
				System.out.print("   Enter 9-digit Account Number : ");
				accNum = scan.nextInt();
				tt = true;
				System.out.print("   Enter Ammount to Deposit (Min Bal Rs.3000) : Rs.");
				savBal = scan.nextDouble();
				while(tt) {
					
					if(savBal < 3000) {
						System.out.println("   Balance cannot be less than Rs.3000 !");
						System.out.print("   Enter Ammount to Deposit (Min Bal Rs.3000) : Rs.");
						savBal = scan.nextDouble();
					}else {
						tt = false;
						break;
					}
				}
				tt= true;
				if(customers.isEmpty()) {
					customers.add(new savingAcc(name,accNum,3000.0,savBal));
					System.out.println("   Account Created! \n");
					tt = false;
				}else {
					for(savingAcc user: customers) {
						while(tt) {
							if(user.account_number == accNum) {
								System.out.println("   Account number already taken, try again! ");
								System.out.print("   Enter 9-digit Account Number : ");
								accNum = scan.nextInt();
							}else {
								
								tt = false;
							}
						}
						
					}
					if(!tt) {
						customers.add(new savingAcc(name,accNum,3000.0,savBal));
						System.out.println("   Account Created! \n");
					}
				}
//				
//				customers.add(new savingAcc(name,accNum,3000.0,savBal));
//				System.out.println("   Account Created! \n");
				break;
			case 2:
				if(customers.isEmpty()) {
					System.out.println("   USer List is Empty! \n");
				}else {
					count = 1;
					for(savingAcc user: customers) {
						System.out.println("\n   Record "+count+" : Name :- "+user.getName());
//						user.getData();
						count++;
					}
				}
				break;
			case 3:
				if(customers.isEmpty()) {
					System.out.println("   USer List is Empty! \n");
				}else {
					check = 0;
					System.out.print("   Enter your 9-digit Account Number : ");
					accNum = scan.nextInt();
					for(savingAcc user: customers) {
						if(user.account_number == accNum) {
							System.out.println("\n Account Details");
							user.getData();
							check = 1;
						}
					}
					if(check != 1) {
						System.out.println("\n Account Not Found!");
					}
				}
				
				break;
			case 4:
				check = 0;
				System.out.print("   Enter your 9-digit Account Number : ");
				accNum = scan.nextInt();
				for(savingAcc user: customers) {
					if(user.account_number == accNum) {
						name = user.cust_name;
						accNum = user.account_number;
						savBal = user.sav_bal;
						System.out.println("\n Account Balance : Rs."+user.sav_bal);
						check = 1;
						
						System.out.print("   Enter Ammount to Deposit : Rs.");
						deposit = scan.nextDouble();
						savBal += deposit;
						user.putData(name, accNum, 3000, savBal);
						System.out.println("\n Money Deposited successfully!");
					}
				}
				if(check != 1) {
					System.out.println("\n Account Not Found!");
				}
				break;
			case 5:
				check = 0;
				System.out.print("   Enter your 9-digit Account Number : ");
				accNum = scan.nextInt();
				for(savingAcc user: customers) {
					if(user.account_number == accNum) {
						name = user.cust_name;
						accNum = user.account_number;
						savBal = user.sav_bal;
						Bal = savBal - 3000;
						System.out.println("\n Account Balance : Rs."+user.sav_bal);
						check = 1;
						
						System.out.print("   Enter Ammount to Withdraw : Rs.");
						withdraw = scan.nextDouble();
//						Bal -= withdraw;
						tt = true;
						while(tt) {
							if(withdraw > Bal) {
								System.out.println("   Account Balance cannot be less than Rs.3000 !");
								System.out.print("   Enter Ammount to Withdraw : Rs.");
								withdraw = scan.nextDouble();
							}else {
								tt = false;
								break;
							}
						}
						savBal -= withdraw;
						user.putData(name, accNum, 3000, savBal);
						System.out.println("\n Money Withdrawn successfully!");
					}
				}
				if(check != 1) {
					System.out.println("\n Account Not Found!");
				}
				break;
			case 6:
				check = 0;
				System.out.print("   Enter your 9-digit Account Number : ");
				accNum = scan.nextInt();
				for(savingAcc user: customers) {
					if(user.account_number == accNum) {
						temp = user;
						check = 1;
					}
				}
				if(check != 1) {
					System.out.println("\n Account Not Found!");
				}else {
					customers.remove(temp);
					System.out.println("\n Account Removed!");
				}
				break;
			default :
				System.out.println(" Invalid Choice");
			}
			System.out.print("\n Press 1 to Continue : ");
			st = scan.nextInt();
		}
		
	}

}
