package com.arithmaticCalcu;
import java.io.IOException;
import java.util.Scanner;
public class arithmaticCalculation 
{
     public static void main(String[] args) throws ArithmeticException 
     {
   	 Scanner scan=new Scanner(System.in);
   	 System.out.println("Welcome To The ArithmaticCalculator\n");
   	 
   
   	 while(true) 
   	 {
   		System.out.println("Please Enter below  Operation\n (1) Addition\n (2) Substraction\n (3) Multiplication\n (4) Division\n (5) Exit");  
   	    int choice=scan.nextInt();
   	    switch(choice) 
   	    {
   	    case 1: 
   	    	         System.out.println("Enter Your Two Number (Addition)\n");
   	                 int a = scan.nextInt();
   	                 int b = scan.nextInt();
   	                 System.out.println("Your Result Is -> "+(a+b));
   	              
   	           
   	             break;
   	         
	 
   	    case 2: 
   	    	    System.out.println("Enter Your Two Number (Substraction)");
	            int c = scan.nextInt();
	            int d = scan.nextInt();
	            System.out.println("Your Result is -> "+(c-d));
   	    
   	   
   		       break;
   	    case 3:
   	    
   	    	    System.out.println("Enter Your Two Number (Multiplication )");
	            int e = scan.nextInt();
	            int f = scan.nextInt();
	            System.out.println("Your Result is -> "+(e*f));
   	    
               break;
   	    case 4:
   	    
   	    	    System.out.println("Enter Your Two Number (Division)");
	            int g = scan.nextInt();
	            int h = scan.nextInt();
	            System.out.println("Your Result is -> "+(g/h));
   	    
   	   
 		       break;
   	    case 5: System.exit(0);
                break;
 	    default: System.out.println("check the option and retry");
 		        break;    	 
               			 
         }
               	      
   	  }
     }
}
   	 
   	 
   	 
   	 
   	 
       	 
