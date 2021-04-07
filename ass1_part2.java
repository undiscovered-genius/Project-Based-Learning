package prac1;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.*;

public class ass1_part2 {
	
	static int gcd(int e,int f) {
		if(e == 0)
			return f;
		return gcd(f % e,e);
	}
	
//	static int lcm(int e,int f) {
//		return(e/gcd(e,f))*f;
//	}

	
	static void calculator(int a, int b) {
		Scanner reader = new Scanner(System.in);
		int st = 1;
		while(st == 1) {
			System.out.println("\n----MENU----");
			System.out.println("1. Add");
			System.out.println("2. Sub");
			System.out.println("3. Mul");
			System.out.println("4. Div");
			System.out.println("5. Pow");
			System.out.println("6. Sqr");
			System.out.println("7. Mean");
			System.out.println("8. Var");
			System.out.println("9. Exit");
			System.out.print("   Enter your Choice : ");
			int ch = reader.nextInt();
			switch(ch) {
			case 1:
				System.out.println(" Add of "+a + " & "+b+ " is "+(a+b));
				break;
			case 2:
				System.out.println(" Sub of "+a + " & "+b+ " is "+(a-b));
				break;
			case 3:
				System.out.println(" Mul of "+a + " & "+b+ " is "+(a*b));
				break;
			case 4:
				System.out.println(" Div of "+a + " & "+b+ " is "+(a/b));
				break;
			case 5:
				System.out.println(" Pow of "+a + " ^ "+b+ " is "+Math.pow(a,b));
				break;
			case 6:
				System.out.println(" Sqr of "+a + " is "+(Math.sqrt(a)));
				break;
			case 7:
				int [] arr = new int [] {5, 2, 8, 7, 1};
				double  s = 0;
				double mn = 0;
				int n = arr.length;
				for(int i = 0; i<n;i++) {
					s = s + (arr[i]);
				}
				mn = s/n;
				System.out.println(" Mean of "+Arrays.toString(arr)+ " is "+mn);
				break;
			case 8:
				int [] arr1 = new int [] {5, 2, 8, 7, 1};
				double  s1 = 0;
				double mn1 = 0;
				int nn = arr1.length;
				for(int i = 0; i<nn;i++) {
					mn1 = mn1 + (arr1[i]);
				}
				mn1 = mn1/nn;
				for(int i = 0; i<nn;i++) {
					s1 = s1 + (arr1[i]*arr1[i]);	
				}
				s1 /= nn;
				System.out.println(" Var of "+Arrays.toString(arr1)+ " is "+(s1 - Math.pow(mn1,2)));
				break;
			case 9:
				System.exit(0);
			default:
				System.out.println(" Invalid Choice ");
			}
			System.out.print("\n Want to Continue (Press 1 - Yes) : ");
			st = reader.nextInt();
		}
	}
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Scanner reader = new Scanner(System.in);
		int st=1;
		String array[] = { "Ayush", "Symbiosis", 
         "CSA2" }; 
		  
		System.out.print("Enter 1st number : ");
		int a = reader.nextInt();
		System.out.print("Enter 2nd number : ");
		int b = reader.nextInt();
//		for(int i = a; i >0;i--) {
//			st = st* i;
//		}
//		System.out.println("Factorial of "+a+" is " + st);
		while(st == 1) {
			System.out.println("\n----MENU----");
			System.out.println("1. Calculator");
			System.out.println("2. GCD");
//			System.out.println("3. Array");
//			System.out.println("4. Convert array to list");
//			System.out.println("5. Largest/Smallest");
			System.out.print("   Enter your Choice : ");
			int ch = reader.nextInt();
			switch(ch) {
			case 1:
				calculator(a,b);
				break;
			case 2:
				System.out.println("GCD of "+a + " & "+b+ " is "+gcd(a,b));
				break;
			case 3:
//				array();
				break;
			case 4:
//				System.out.println("Array: "+ Arrays.toString(array)); 
//				 List<String> list = convertArrayToList(array);
//				 System.out.println("List : " + list);
				 break;
			case 5 :
//				largest();
				break;
			default:
				System.out.println(" Invalid Choice ");
			}
			System.out.print("\n Want to Continue (Press 1 - Yes) : ");
			st = reader.nextInt();
		}
		
//		a++;
//		a +=3;
//		int c =2;
//		System.out.println(a+b);
//		
//		try {
//			
//			
//			String name = reader.next();
//			
//			System.out.println(name);
//		}catch(Exception e){
//			System.out.println("   "+ e);
//		}
//		
//		Random rand = new Random();
//		int e = rand.nextInt(100);
//		int f = rand.nextInt(1000);
//		
//		System.out.println("LCM of "+e + " & "+f+ " is "+lcm(e,f));
		
		
	}

}
