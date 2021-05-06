package assignment6;

import java.util.ArrayList;
import java.util.Scanner;


public class Result extends Student implements Exam{

	@Override
	public  float Percent_call(float mark1, float mark2) {
		// TODO Auto-generated method stub
		float per = (mark1 + mark2)/2;
		return per;
	}

	public static void main(String[] args) {
		int st=1,ch,count,check;
		String name;
		int roll;
		boolean tt =true;
		float per,mark1,mark2;
		float temp1,temp2;
		ArrayList<Student> students = new ArrayList<Student>();
		Exam ex;
		ex = new Result();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("------SCHOOL------\n\n");
		
		while(st == 1) {
			System.out.println("-------Menu--------");
			System.out.println("1. Enter Details");
			System.out.println("2. Display Details");
			System.out.print("   Enter Choice (1-2) : ");
			ch = scan.nextInt();
			
			switch(ch) {
			case 1:
				System.out.print("   Enter Name : ");
				name = scan.next();
				
				System.out.print("   Enter 9-digit PRN : ");
				roll = scan.nextInt();
				
				System.out.print("   Enter Marks in Subject 1 : ");
				mark1 = scan.nextFloat();
				
				tt = true;
				while(tt) {
					if(mark1<0) {
						System.out.println("   Marks cannot be negative! ");
						System.out.print("   Re-enter Marks in Subject 1 : ");
						mark1 = scan.nextFloat();
					}else {
						tt = false;
					}
				}
				System.out.print("   Enter Marks in Subject 2 : ");
				mark2 = scan.nextFloat();
				tt = true;
				while(tt) {
					if(mark2<0) {
						System.out.println("   Marks cannot be negative! ");
						System.out.print("   Re-enter Marks in Subject 2 : ");
						mark2 = scan.nextFloat();
					}else {
						tt = false;
					}
				}
				
				tt= true;
				if(students.isEmpty()) {
					students.add(new Student(name,roll,mark1,mark2));
					System.out.println("   Details Added! \n");
					tt = false;
				}else {
					for(Student student: students) {
						while(tt) {
							if(student.getRoll() == roll) {
								System.out.println("   PRN already exists, try again! ");
								System.out.print("   Enter 9-digit PRN : ");
								roll = scan.nextInt();
							}else {
								
								tt = false;
							}
						}
						
					}
					if(!tt) {
						students.add(new Student(name,roll,mark1,mark2));
						System.out.println("   Details Added! \n");
					}
				}
				break;
			case 2:
				if(students.isEmpty()) {
					System.out.println("   Student List is Empty! \n");
				}else {
					count = 1;
					for(Student student: students) {
						System.out.println("\n   Record "+count);
						System.out.println("     Name : "+student.getName());
						System.out.println("     PRN : "+student.getRoll());
						System.out.println("     Marks in Subject1 : "+student.getMark1());
						System.out.println("     Marks in Subject2 : "+student.getMark2());
						
						if(student.getMark1()<30 || student.getMark2()<30) {
							System.out.println("     Percentage : FAIL (Marks in one of the subject is <30)");
						}else {
							System.out.println("     Percentage : "+ex.Percent_call(student.getMark1(), student.getMark2()));
						}
						
						count++;
					}
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
