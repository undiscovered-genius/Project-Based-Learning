package prac1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

class EmployeeV {
	int id;
	String name;
	String sex;
	String job;
	String cmpny;
	
	EmployeeV(int i,String n,String s,String j,String c){
		id = i;
		name = n;
		sex = s;
		job = j;
		cmpny = c;
	}
	
	void display() {
		System.out.println(" EMP ID : "+id);
		System.out.println(" Name : "+name);
		System.out.println(" Sex : "+sex);
		System.out.println(" JOB : "+job);
		System.out.println(" Company Name : "+cmpny);
	}
}

class NameComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		EmployeeV emp1 = (EmployeeV)o1;
		EmployeeV emp2 = (EmployeeV)o2;
		if(emp1.name.equals(emp2.name)) {
			return 0;
		}else {
			return -1;
		}
	}
	
}

public class ass3_part2 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int count = 0;
		int x,i,z,p,st=1,sr,er=0;
		String n,s,j,c,srh;
		int sum = 0;
		float pr;
		
		Vector<EmployeeV> emp = new Vector<EmployeeV>(); 
		
		while(st == 1) {   
		    System.out.println("----MENU----");
		    System.out.println("1. ADD Employee");
		    System.out.println("2. Display Records");
		    System.out.println("3. Search Records");
		    System.out.println("4. Sorted Records");
		    System.out.println("5. Delete Record");
		    System.out.print("   Enter your Choice : ");
	        i = reader.nextInt();
	    
	    	switch(i) {
		    case 1:
		    	System.out.print("\n Enter EMP ID : ");
		    	p = reader.nextInt();
		    	System.out.print(" Enter Name : ");
		    	n = reader.next();
		    	System.out.print(" Enter Sex : ");
		    	s = reader.next();
		    	System.out.print(" Enter JOB Title : ");
		    	j = reader.next();
		    	System.out.print(" Enter Company Name : ");
		    	c = reader.next();
		    	emp.add(new EmployeeV(p,n,s,j,c));
		    	count++;
		    	break;
		    case 2:
		    	for(EmployeeV e: emp) {
		    		e.display();
		    	}
		    	break;
		    case 3:
		    	System.out.println("----SEARCH----");
			    System.out.println("1. SEARCH by EMP ID");
			    System.out.println("2. SEARCH by Name");
			    System.out.println("3. SEARCH by JOB Title");
			    System.out.println("4. SEARCH by Company Name");
			    System.out.print("   Enter your Choice : ");
		        z = reader.nextInt();
		    	switch(z) {
			    case 1:
			    	System.out.println(" Enter EMP ID : ");
			    	sr = reader.nextInt();
			    	for(EmployeeV e: emp) {
			    		if(e.id == sr) {
			    			e.display();
			    			er++;
			    		}
			    	}
			    	if(er<1) {
			    		System.out.println(" Record not Found! ");
			    	}
			    	break;
			    case 2:
			    	System.out.println(" Enter Name : ");
			    	srh = reader.next();
			    	er = 0;
			    	for(EmployeeV e: emp) {
			    		if(e.name.toLowerCase().equals(srh.toLowerCase())) {
			    			e.display();
			    			er++;
			    		}
			    	}
			    	if(er<1) {
			    		System.out.println(" Record not Found! ");
			    	}
			    	break;
			    case 3:
			    	System.out.println(" Enter JOB Title : ");
			    	srh = reader.next();
			    	er = 0;
			    	for(EmployeeV e: emp) {
			    		if(e.job.toLowerCase().equals(srh.toLowerCase())) {
			    			e.display();
			    			er++;
			    		}
			    	}
			    	if(er<1) {
			    		System.out.println(" Record not Found! ");
			    	}
		    	    break;
			    case 4:
			    	System.out.println(" Enter Company Name : ");
			    	srh = reader.next();
			    	er = 0;
			    	for(EmployeeV e: emp) {
			    		if(e.cmpny.toLowerCase().equals(srh.toLowerCase())) {
			    			e.display();
			    			er++;
			    		}
			    	}
			    	if(er<1) {
			    		System.out.println(" Record not Found! ");
			    	}
			    	break;
		    	default:
		    		System.out.println("\n Invalid Choice!");
		    	}
		    	break;
		    case 4:
		    	int yz =0;
		    	Collections.sort(emp,new NameComparator());
		    	Iterator itr = emp.iterator();
		    	while(itr.hasNext()) {
		    		EmployeeV e = (EmployeeV)itr.next();
		    		System.out.println("\n Record "+" -> "+e.id+" -> "+e.name+" -> "+e.sex+" -> "+e.job+" -> "+e.cmpny);
		    	}
		    	break;
		    case 5:
		    	int zzz =1;
		    	for(EmployeeV e: emp) {
		    		//System.out.println("\n Record "+(zzz));
		    		System.out.println("\n Record "+(zzz)+" -> "+e.id+" -> "+e.name+" -> "+e.job+" -> "+e.cmpny);
		    		//e.display();
		    		zzz++;
		    	}
		    	System.out.println(" Enter Record No. : ");
		    	sr = reader.nextInt();
		    	if(sr<= count) {
		    		emp.remove(sr-1);
		    	    count--;
		    	    System.out.println(" Record Deleted!");
		    	}else {
		    		System.out.println(" Invalid Record No!");
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
