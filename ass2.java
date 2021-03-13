package prac1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ass2 {
	static void array(int arr[]) {
		      
	        int temp = 0;    
	       
	        System.out.print(" Array : ");    
	        for (int i = 0; i < arr.length; i++) {     
	            System.out.print(arr[i] + " ");    
	        }   
	        System.out.print("\n Reverse of Array : ");    
	        for (int i = arr.length - 1; i >= 0; i--) {     
	            System.out.print(arr[i] + " ");    
	        } 
	        System.out.print("\n Sorted Array : ");    
	        for (int i = 0; i < arr.length; i++) { 
	        	for(int j =i+1; j<arr.length;j++) {
	        		if(arr[i] > arr[j]) {
	        			temp = arr[i];
		        		arr[i] = arr[j];
		        		arr[j] = temp ;
	        		}
	        	}    
	        } 
	        for (int i = 0; i < arr.length; i++) {     
	            System.out.print(arr[i] + " ");    
	        } 
	}
	
	static void largest(int arr[]) {
		
		System.out.print(" Array : ");    
       for (int i = 0; i < arr.length; i++) {     
           System.out.print(arr[i] + " ");    
       } 
       
       int lrg = arr[0], sml = arr[0];
     
       for (int i = 0; i < arr.length; i++) {     
           if(arr[i]> lrg) {
           	lrg = arr[i];
           }
           if(arr[i]<sml) {
           	sml = arr[i];
           }
       } 
       System.out.println("\n Largest value in array : "+lrg);
       System.out.println( " Smallest value in array :  "+sml);
       System.out.println( " Difference b/w Largest & Smallest Value :  "+(lrg-sml));
	}
	
static void peak(int arr[]) {
		
		System.out.print(" Array : ");    
       for (int i = 0; i < arr.length; i++) {     
           System.out.print(arr[i] + " ");    
       } 
       
       System.out.println(" ");
     
       for (int i = 1; i < (arr.length-1); i++) {     
           if(arr[i]> arr[i-1] && arr[i]>arr[i+1]) {
        	   System.out.println(" Peak Value is : "+arr[i]);
           }
       } 

	}
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int st=1;  
		System.out.print("Enter size of array : ");
		int a = reader.nextInt();
		int[] array = new int[a];
		for(int i=0;i<a;i++) {
			System.out.print("Enter element "+(i+1)+" : ");
			array[i] = reader.nextInt();
		}
		int k=0, l=0;
		int[] odd = new int[a];
		int[] even = new int[a];
		while(st == 1) {
			System.out.println("\n----MENU----");
			System.out.println("1. Odd/Even Array");
			System.out.println("2. Peak Element");
			System.out.println("3. Convert array to list");
			System.out.println("4. Diff b/w lrgst & smlst");
			System.out.print("   Enter your Choice : ");
			int ch = reader.nextInt();
			switch(ch) {
			case 1:
				for(int i=0;i<a;i++) {
					if((array[i]%2)==0) {
						even[k]=array[i];
						k++;
					}else {
						odd[l]=array[i];
						l++;
					}
				}
				System.out.println(" Original Array: "+ Arrays.toString(array));
				System.out.print(" Odd Array: ");
				for(int i =0;i<l;i++) {
					System.out.print(odd[i]+" "); 
				}
				System.out.print("\n Even Array: "); 
				for(int i =0;i<k;i++) {
					System.out.print(even[i]+" "); 
				}
				break;
			case 2:
				peak(array);
				break;
			case 3:
				System.out.println("Array: "+ Arrays.toString(array)); 
				List<Integer> list = new ArrayList<>(a); 
				// Iterate through the array 
		        for (int i = 0;i<a;i++) {  
		            list.add(array[i]); 
		        } 
				 System.out.println("List : " + list);
				 break;
			case 4 :
				largest(array);
				break;
			default:
				System.out.println(" Invalid Choice ");
			}
			System.out.print("\n Want to Continue (Press 1 - Yes) : ");
			st = reader.nextInt();
		}
	}
}
