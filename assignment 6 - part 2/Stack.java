package assignment6;


import java.util.Scanner;

public class Stack {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int st=1, tt=1, ch, hh, size, data;
		
		System.out.println("------STACK------\n");

		System.out.print("   Enter Initial Length of Stack : ");
		size = scan.nextInt();
		IntStack fixed = new FixedStack(size);
		IntStack growable = new GrowableStack(size);
		System.out.println("\n");
		
		while(st == 1) {
			System.out.println("-------Menu--------");
			System.out.println("1. Enter Data in Stack");
			System.out.println("2. Display Stack");
			System.out.print("   Enter Choice (1-2) : ");
			ch = scan.nextInt();
			
			switch(ch) {
			case 1:
				System.out.println("-------Enter Data--------");
				System.out.println("1. Fixed Stack");
				System.out.println("2. Growable Stack");
				System.out.print("   Enter Choice (1-2) : ");
				hh = scan.nextInt();
				tt=1;
				while(tt == 1) {
					
					switch(hh) {
					case 1:
						System.out.print("   Enter Data : ");
						data = scan.nextInt();
						fixed.push(data);
						break;
					case 2:
						System.out.print("   Enter Data : ");
						data = scan.nextInt();
						growable.push(data);
						break;
					default :
						System.out.println(" Invalid Choice");
					}
					System.out.print("\n Press 1 to ADD data : ");
					tt = scan.nextInt();
				}
				break;
			case 2:
			
					System.out.println("-------Display--------");
					System.out.println("1. Fixed Stack");
					System.out.println("2. Growable Stack");
					System.out.print("   Enter Choice (1-2) : ");
					hh = scan.nextInt();
					switch(hh) {
					case 1:
						System.out.print("   Datas in Stack : ");
						if(fixed.isEmpty()) {
							System.out.print(" Stack Underflow ");
						}else {
							while(!fixed.isEmpty()) {
								System.out.print(fixed.pop()+"  ");
							}
						}
						break;
					case 2:
						System.out.print("   Datas in Stack : ");
						if(growable.isEmpty()) {
							System.out.print(" Stack Underflow ");
						}else {
							while(!growable.isEmpty()) {
								System.out.print(growable.pop()+"  ");
							}
						}
						break;
					default :
						System.out.println(" Invalid Choice");
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
