package assignment7;

import java.util.InputMismatchException;
import java.util.Scanner;

class Rational{
	private int numerator;
	private int denominator;
	
	Scanner scan = new Scanner(System.in);
	
	public Rational(int x,int y) {
		this.numerator = x;
		this.denominator = y;
	}
	
	public Rational() {
		this.numerator = 0;
		this.denominator = 0;
	}
	
	 void reduceFraction(int x, int y) 
	{ 
	    int d; 
	    d = gcd(x, y); 
	  
	    x = x / d; 
	    y = y / d; 
	  
	    System.out.println(" " + x + "/" + y); 
	} 
	  
	 int gcd(int x, int y) 
	{ 
	    if (y == 0) 
	        return x; 
	    return gcd(y, x % y); 
	      
	}
	
    public void addition() {
    	int n1, n2, d1, d2, temp1,temp2;
		Rational r1;
		Rational r2;
    	Rational add = new Rational();
    	
    	try {
    		System.out.println("   Number 1 : ");
    		System.out.print("              Numerator : ");
    		n1 = scan.nextInt();
    		System.out.print("              Denominator : ");
    		d1 = scan.nextInt();
    		r1 = new Rational(n1,d1);
    		System.out.println("\n   Number 2 : ");
    		System.out.print("              Numerator : ");
    		n2 = scan.nextInt();
    		System.out.print("              Denominator : ");
    		d2 = scan.nextInt();
    		r2 = new Rational(n2,d2);
    		
            try {
            	temp1 = r1.numerator/ r1.denominator;
            	temp2 = r2.numerator/  r2.denominator;
            	
            	add.numerator =(r1.numerator*r2.denominator)+(r2.numerator*r1.denominator);
    	    	add.denominator = r1.denominator*r2.denominator;
    			System.out.println("");
    			System.out.print(" Addition : " +r1.numerator + "/" +r1.denominator +" + "
    					+r2.numerator +"/"+r2.denominator+" = ");
    			reduceFraction(add.numerator,add.denominator);
    		}catch(ArithmeticException e) {
    			System.out.println(" Exception : "+e);
    		}
    	}catch(InputMismatchException e) {
    		System.out.println("\n Entered Data is Not a Number!");
    	}
	}
	
    public void subtraction() {
    	int n1, n2, d1, d2, temp1, temp2;
		Rational r1;
		Rational r2;
    	Rational sub = new Rational();
    	
    	try {
    		System.out.println("   Number 1 : ");
    		System.out.print("              Numerator : ");
    		n1 = scan.nextInt();
    		System.out.print("              Denominator : ");
    		d1 = scan.nextInt();
    		r1 = new Rational(n1,d1);
    		System.out.println("\n   Number 2 : ");
    		System.out.print("              Numerator : ");
    		n2 = scan.nextInt();
    		System.out.print("              Denominator : ");
    		d2 = scan.nextInt();
    		r2 = new Rational(n2,d2);
    		
            try {
    			temp1 = r1.numerator/ r1.denominator;
    			temp2 = r2.numerator / r2.denominator;
    			sub.numerator =(r1.numerator*r2.denominator)-(r2.numerator*r1.denominator);
    	    	sub.denominator = r1.denominator*r2.denominator;
    			System.out.println("");
    			System.out.print(" Subtractin : " +r1.numerator + "/" +r1.denominator +" - "
    					+r2.numerator +"/"+r2.denominator+" = ");
    			reduceFraction(sub.numerator,sub.denominator);
    		}catch(ArithmeticException e) {
    			System.out.println(" Exception : "+e);
    		}
    	}catch(InputMismatchException e) {
    		System.out.println("\n Entered Data is Not a Number!");
    	}
	}

    public void multiplication() {
    	int n1, n2, d1, d2, tmp1, tmp2;
		Rational r1;
		Rational r2;
    	Rational mul = new Rational();
    	
        try {
        	System.out.println("   Number 1 : ");
    		System.out.print("              Numerator : ");
    		n1 = scan.nextInt();
    		System.out.print("              Denominator : ");
    		d1 = scan.nextInt();
    		r1 = new Rational(n1,d1);
    		System.out.println("\n   Number 2 : ");
    		System.out.print("              Numerator : ");
    		n2 = scan.nextInt();
    		System.out.print("              Denominator : ");
    		d2 = scan.nextInt();
    		r2 = new Rational(n2,d2);

    		try {
    			tmp1 = r1.numerator / r1.denominator;
    			tmp2 = r2.numerator / r2.denominator;
    			
    			mul.numerator =(r1.numerator)*(r2.numerator);
    	    	mul.denominator = r1.denominator*r2.denominator;
    			System.out.println("");
    			System.out.print(" Multiplication : " +r1.numerator + "/" +r1.denominator +" * "
    					+r2.numerator +"/"+r2.denominator+" = ");
    			reduceFraction(mul.numerator,mul.denominator);
    		}catch(ArithmeticException e) {
    			System.out.println(" Exception : "+e);
    		}
    	}catch(InputMismatchException e) {
    		System.out.println("\n Entered Data is Not a Number!");
    	}
	}

    public void division() {
    	int n1, n2, d1, d2,tmp;
		Rational r1;
		Rational r2;
    	Rational div = new Rational();
    	
        try {
        	System.out.println("   Number 1 : ");
    		System.out.print("              Numerator : ");
    		n1 = scan.nextInt();
    		System.out.print("              Denominator : ");
    		d1 = scan.nextInt();
    		r1 = new Rational(n1,d1);
    		System.out.println("\n   Number 2 : ");
    		System.out.print("              Numerator : ");
    		n2 = scan.nextInt();
    		System.out.print("              Denominator : ");
    		d2 = scan.nextInt();
    		r2 = new Rational(n2,d2);

    			div.numerator =(r1.numerator)*(r2.denominator);
    	    	div.denominator = r1.denominator*r2.numerator;
    	    	
    	    	try {
    	    		tmp = div.numerator / div.denominator;
    	    		System.out.println("");
        			System.out.print(" Multiplication : " +r1.numerator + "/" +r1.denominator +" * "
        					+r2.numerator +"/"+r2.denominator+" = ");
        			reduceFraction(div.numerator,div.denominator);
    	    	}catch(ArithmeticException e) {
    	    		System.out.println(" Exception : "+e);
    	    		
    	    	}

    	}catch(InputMismatchException e) {
    		System.out.println("\n Entered Data is Not a Number!");
    	}
	}
    
    public void compare() {
    	int n1, n2, d1, d2, comp, tmp1, tmp2;
		Rational r1;
		Rational r2;
    	
        try {
        	System.out.println("   Number 1 : ");
    		System.out.print("              Numerator : ");
    		n1 = scan.nextInt();
    		System.out.print("              Denominator : ");
    		d1 = scan.nextInt();
    		r1 = new Rational(n1,d1);
    		System.out.println("\n   Number 2 : ");
    		System.out.print("              Numerator : ");
    		n2 = scan.nextInt();
    		System.out.print("              Denominator : ");
    		d2 = scan.nextInt();
    		r2 = new Rational(n2,d2);

    		try {
    			tmp1 = r1.numerator / r1.denominator;
    			tmp2 = r2.numerator / r2.denominator;
    			comp = (r1.numerator*r2.denominator)-(r2.numerator*r1.denominator);
    			if(comp > 0) {
    				System.out.println(" Comparison : "+r1.numerator+"/"+r1.denominator+"  >  "
    						+r2.numerator+"/"+r2.denominator);
    			}else {
    				System.out.println(" Comparison : "+r1.numerator+"/"+r1.denominator+"  <  "
    						+r2.numerator+"/"+r2.denominator);
    			}
    		}catch(ArithmeticException e) {
    			System.out.println(" Exception : "+e);
    		}
    	}catch(InputMismatchException e) {
    		System.out.println("\n Entered Data is Not a Number!");
    	}
	}
    
    public void absolute() {
    	int n1, d1, tmp1;
		Rational r1;
		Rational abs = new Rational();
		
        try {
        	System.out.println("   Number 1 : ");
    		System.out.print("              Numerator : ");
    		n1 = scan.nextInt();
    		System.out.print("              Denominator : ");
    		d1 = scan.nextInt();
    		r1 = new Rational(n1,d1);
    		
    		try {
    			tmp1 = r1.numerator / r1.denominator;
               if(r1.numerator < 0 && r1.denominator < 0) {
            	   abs.denominator = r1.denominator * (-1);
            	   abs.numerator = r1.numerator * (-1);
               }else if(r1.denominator < 0 ) {
            	   abs.denominator = r1.denominator * (-1);
            	   abs.numerator = r1.numerator;
               }else if(r1.numerator < 0) {
            	   abs.numerator = r1.numerator * (-1);
            	   abs.denominator = r1.denominator;
               }else {
            	   abs.numerator = r1.numerator;
            	   abs.denominator = r1.denominator;
               }
        		System.out.print("\n Absolute Value of "+r1.numerator+"/"+r1.denominator+" = ");
        		reduceFraction(abs.numerator,abs.denominator);
    		}catch(ArithmeticException e) {
    			System.out.println(" Exception : "+e);
    		}	
    	}catch(InputMismatchException e) {
    		System.out.println("\n Entered Data is Not a Number!");
    	}
	}

    void convert() {
    	int n1, d1, tmp1;
		Rational r1;
		float num;
		
        try {
        	System.out.println("   Number  : ");
    		System.out.print("              Numerator : ");
    		n1 = scan.nextInt();
    		System.out.print("              Denominator : ");
    		d1 = scan.nextInt();
    		r1 = new Rational(n1,d1);
    		
    		try {
    			tmp1 = r1.numerator / r1.denominator;
                num = (float) r1.numerator / r1.denominator;
        		System.out.println("\n Floating Point : "+r1.numerator+"/"+r1.denominator+" = "+num);
    		}catch(ArithmeticException e) {
    			System.out.println(" Exception : "+e);
    		}	
    	}catch(InputMismatchException e) {
    		System.out.println("\n Entered Data is Not a Number!");
    	}
    }
    
	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
}

public class rationalNumber {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		
		int st=1, ch;
		Rational rat = new Rational();
		
		System.out.println("------Rational Number------\n");
		
		while(st == 1) {
			System.out.println("-------Menu--------");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Compare");
			System.out.println("6. Convert to float");
			System.out.println("7. Absolute Value ");
			System.out.print("   Enter Choice (1-7) : ");
			ch = scan.nextInt();
			
			switch(ch) {
			case 1:
				
				rat.addition();
				break;
			case 2:
				rat.subtraction();
				break;
            case 3:
            	rat.multiplication();
				break;
			case 4:
				rat.division();
				break;
            case 5:
            	rat.compare();
				break;
			case 6:
				rat.convert();
				break;
			case 7:
				rat.absolute();
				break;
			default :
				System.out.println(" Invalid Choice");
			}
			System.out.print("\n Press 1 to Continue : ");
			st = scan.nextInt();
		}

	}

}
