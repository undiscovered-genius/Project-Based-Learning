package prac1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

class Student{
	int prn;
	String name;
	String dob;
	List<Integer> marks=new ArrayList<Integer>(); 
	float per;
	
	Student(){
		prn = 040;
		name = "Ayush";
		dob = "15/3";
		marks.add(78);  
		marks.add(84);  
	    marks.add(66);  
		marks.add(59);
		marks.add(95);
		System.out.println("Default");
	}
	
	Student(int p,String n,String d,List m,float pr){
		prn = p;
		name = n;
		dob = d;
		marks = m;
		per = pr;
	}
	void percent(float per) {
		grade(per);
	}
	
	void grade(float per) {
		if(per > 90) {
			System.out.println(" Grade : A+");
		}else if(per>80 && per <=90) {
			System.out.println(" Grade : A+");
		}else if(per >70 && per<=80) {
			System.out.println(" Grade : B+");
		}else if(per>60 && per<=70) {
			System.out.println(" Grade : B");
		}else if(per>50 && per<=60) {
			System.out.println(" Grade : C");
		}else if(per<40) {
			System.out.println(" Grade : Fail");
		}
	}
	void display() {
		int sum =0;
		System.out.println(" PRN : "+prn);
		System.out.println(" Name : "+name);
		System.out.println(" Date of Birth : "+dob);
		System.out.println(" Marks : ");
		for(int i=0;i<5;i++) {
			System.out.println("       Subject "+(i+1)+" : "+marks.get(i));
			//sum = sum +  marks.get(i);
		}
		//per = sum/5;
		System.out.println(" Percentage : "+per);
		percent(per);
	}	
}

class PerComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Student stu1 = (Student)o1;
		Student stu2 = (Student)o2;
		if(stu1.per == stu2.per) {
			return 0;
		}else if(stu1.per > stu2.per) {
			return 1;
		}else {
			return -1;
		}
	}
	
}

public class ass3_part1{
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int count = 0;
		int x,i,z,p,st=1,sr,er=0;
		String n,d,srh;
		
		int sum = 0;
		float pr;
		//Student stu[] = new Student[5];
	
		List<Student> stu1 = new ArrayList<Student>();
		
		while(st == 1) {   
		    System.out.println("----MENU----");
		    System.out.println("1. Enter Record");
		    System.out.println("2. Display Records");
		    System.out.println("3. Search Records");
		    System.out.println("4. Update Record");
		    System.out.println("5. Delete Record");
		    System.out.println("6. Sorted Records");
		    System.out.print("   Enter your Choice : ");
	        i = reader.nextInt();
	    
	    	switch(i) {
		    case 1:
		    	sum = 0;
		    	List<Integer> m = new ArrayList<Integer>(5);
		    	System.out.print("\n Enter PRN : ");
		    	p = reader.nextInt();
		    	System.out.print(" Enter Name : ");
		    	n = reader.next();
		    	System.out.print(" Enter DOB (DD/MM/YY) : ");
		    	d = reader.next();
		    	System.out.println(" Enter Marks : ");
		    	for(i=0;i<5;i++) {
		    		System.out.print(" Marks "+(i+1)+" : ");
		    		x = reader.nextInt();
		    		m.add(i, x);
		    		sum = sum+x;
		    	}
		    	pr = sum/5;
		    	//stu[count] = new Student(p,n,d,m,pr);
		    	stu1.add(new Student(p,n,d,m,pr));
		    	count++;
		    	break;
		    case 2:
//		    	for(i=0;i<count;i++) {
//		    		
//		    		//stu[i].display();
//		    		System.out.println(""+stu1);
//		    	}
		    	int zz =1;
		    	for(Student s: stu1) {
		    		System.out.println("\n Record "+(zz));
		    		s.display();
		    		zz++;
		    	}
		    	break;
		    case 3:
		    	System.out.println("----SEARCH----");
			    System.out.println("1. SEARCH by PRN");
			    System.out.println("2. SEARCH by Name");
			    System.out.println("3. SEARCH by DOB");
			    System.out.print("   Enter your Choice : ");
		        z = reader.nextInt();
		    	switch(z) {
			    case 1:
			    	System.out.println(" Enter PRN : ");
			    	sr = reader.nextInt();
			    	for(Student s: stu1) {
			    		if(s.prn == sr) {
			    			s.display();
			    			er++;
			    		}
			    	}
			    	if(er<1) {
			    		System.out.println(" PRN not Found! ");
			    	}
//			    	for(i=0;i<count;i++) {
//			    		if(stu[i].prn == sr) {
//			    			stu[i].display();
//			    			er++;
//			    		}
//			    	}
			    	break;
			    case 2:
			    	System.out.println(" Enter Name : ");
			    	srh = reader.next();
			    	er = 0;
			    	for(Student s: stu1) {
			    		if(s.name.toLowerCase().equals(srh.toLowerCase())) {
			    			s.display();
			    			er++;
			    		}
			    	}
//			    	for(i=0;i<count;i++) {
//			    		if(stu[i].name.toLowerCase().equals(srh.toLowerCase())) {
//			    			stu[i].display();
//			    			er++;
//			    		}
//			    	}
			    	if(er<1) {
			    		System.out.println(" Name not Found! ");
			    	}
			    	break;
			    case 3:
			    	System.out.println(" Enter DOB (DD/MM/YY) : ");
			    	srh = reader.next();
			    	er = 0;
			    	for(Student s: stu1) {
			    		if(s.dob.equals(srh)) {
			    			s.display();
			    			er++;
			    		}
			    	}
//			    	for(i=0;i<count;i++) {
//			    		if(stu[i].dob.equals(srh)) {
//			    			stu[i].display();
//			    			er++;
//			    		}
//			    	}
			    	if(er<1) {
			    		System.out.println(" DOB not Found! ");
			    	}
			    	break;
			    default:
			    	System.out.println("\n Invalid Choice!");
			    }
		    	break;
		    case 4:
		    	int zzzz =1;
		    	for(Student s: stu1) {
		    		System.out.println("\n Record "+(zzzz)+" -> "+s.name);
		    		zzzz++;
		    	}
//		    	for(i=0;i<count;i++) {
//		    		System.out.println(" Record No. "+(i+1)+" -> "+stu[i].name);
//		    	}
		    	System.out.println(" Enter Record No. : ");
		    	sr = reader.nextInt();
		    	zzzz=1;
		    	for(Student s: stu1) {
		    		if(zzzz == sr) {
		    			System.out.print("\n Enter PRN : ");
				    	p = reader.nextInt();
				    	s.prn = p;
				    	System.out.print(" Enter Name : ");
				    	n = reader.next();
				    	s.name = n;
				    	System.out.print(" Enter DOB (DD/MM/YY) : ");
				    	d = reader.next();
				        s.dob = d;
				        System.out.println(" Record Updated!");
		    		}
		    		zzzz++;
		    	}
		    	break;
		    case 5:
		    	int zzz =1;
		    	for(Student s: stu1) {
		    		System.out.println("\n Record "+(zzz));
		    		s.display();
		    		zzz++;
		    	}
		    	System.out.println(" Enter Record No. : ");
		    	sr = reader.nextInt();
		    	if(sr<= count) {
		    		stu1.remove(sr-1);
		    	    count--;
		    	    System.out.println(" Record Deleted!");
		    	}else {
		    		System.out.println(" Invalid Record No!");
		    	}
		    	break;
		    case 6:
		    	//float[] pr = new float[5];
		    	int yz =0;
//		    	for(i=0;i<count;i++) {
//		    		pr[zz]=stu[i].per;
//		    		zz++;
//		    	}
		    	Collections.sort(stu1,new PerComparator());
		    	Iterator itr = stu1.iterator();
		    	while(itr.hasNext()) {
		    		Student s = (Student)itr.next();
		    		System.out.println(s.prn +"   "+s.name+"   "+s.dob+"   "+s.per);
		    	}
		    	
		    	break;
		    default:
		    	System.out.println("\n Invalid Choice!");
		    }
	    	System.out.print("\n Press 1 Continue :");
	    	st = reader.nextInt();
	    }
	}
}
