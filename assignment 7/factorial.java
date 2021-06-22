package assignment7;


import java.util.Scanner;

public class factorial {
	static int findFactorial(int n) throws MyException{
		if(n<0 || n>12) {
			System.out.println(" Factorial cant be found");
			System.exit(0);
		}
		if(n == 0) {
			return 1;
		}else {
			return n*findFactorial(n-1);
		}
	}
	class MyException extends Exception{

		private static final long serialVersionUID = 2851412402264993451L;

		public MyException(String message, Throwable cause) {
			super(message, cause);
			System.out.println(" Exception : "+ message);
		}
	}

	
	public static void main(String[] args) throws MyException {
		int st = 1;
		int a;
		Scanner reader = new Scanner(System.in);
		while(st == 1) {
			System.out.println("\n----MENU----");
			System.out.println("1. Factorial (Command Line args)");
			System.out.println("2. Exit");
			System.out.print("   Enter your Choice : ");
			int ch = reader.nextInt();
			switch(ch) {
			case 1:
				try {
					int z = Integer.parseInt(args[0]);
					System.out.println("\n Factorial of "+args[0]+" is "+findFactorial(z));
				} catch (MyException e) {
					// TODO Auto-generated catch block
					System.out.println("\n Exception : ");
					System.out.println("               "+e);
					
				}
				break;	
			case 2:
				System.exit(0);
			default:
				System.out.println(" Invalid Choice ");
			}
			System.out.print("\n Want to Continue (Press 1 - Yes) : ");
			st = reader.nextInt();
		}
	}
}
