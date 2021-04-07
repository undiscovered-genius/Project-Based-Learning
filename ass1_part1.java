package prac1;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Console;
import java.util.Scanner;

public class ass1_part1 {
	static int factorial(int n) {
		if(n<0) {
			System.out.println(" Number can't be -ve .");
			System.exit(0);
		}
		if(n == 0) {
			return 1;
		}else {
			return n*factorial(n-1);
		}
	}
	public static void main(String[] args) throws IOException,NullPointerException{
		int st = 1;
		int a;
		Scanner reader = new Scanner(System.in);
		while(st == 1) {
			System.out.println("\n----MENU----");
			System.out.println("1. Scanner");
			System.out.println("2. BufferedReader");
			System.out.println("3. DataInputStream");
			System.out.println("4. Console");
			System.out.println("5. Command Line args");
			System.out.println("6. Exit");
			System.out.print("   Enter your Choice : ");
			int ch = reader.nextInt();
			switch(ch) {
			case 1:
				System.out.print(" Enter a number : ");
				a = reader.nextInt();
				System.out.println("\n Factorial of "+a+" is "+factorial(a));
				break;
			case 2:
				System.out.print(" Enter a number : ");
				try {
					BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
					a = Integer.parseInt(read.readLine());
					System.out.println("\n Factorial of "+a+" is "+factorial(a));
				}catch(Exception e) {
					System.out.println(""+e);
				}
				break;
			case 3:
			 try{
				    System.out.print(" Enter a number : ");
					DataInputStream data = new DataInputStream(System.in);
					a = Integer.parseInt(data.readLine());
					System.out.println("\n Factorial of "+a+" is "+factorial(a));
				}catch(Exception e) {
					System.out.println(""+e);
				}
				break;
			case 4:
				try{
				    System.out.print(" Enter a number : ");
					a = Integer.parseInt(System.console().readLine());
					System.out.println("\n Factorial of "+a+" is "+factorial(a));
				}catch(Exception e) {
					System.out.println("Exception : "+e);
				}
				break;
			case 5:
				int z = Integer.parseInt(args[0]);
				System.out.println("\n Factorial of "+args[0]+" is "+factorial(z));
			case 6:
				System.exit(0);
			default:
				System.out.println(" Invalid Choice ");
			}
			System.out.print("\n Want to Continue (Press 1 - Yes) : ");
			st = reader.nextInt();
		}
	}

}
