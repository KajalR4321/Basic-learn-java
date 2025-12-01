package myPack;

import java.util.Scanner;

public class FirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		
		//second program variable
		String name="kajal";
		System.out.println("kajal");
		//third program add
		int  a = 7;
		int b = 8;
		 int mul=a*b;
		 System.out.println(mul);
		 // forth program 
		 int r=10;
		 int e=6;
		 int f= (r*e)/(r-e);// f and t both are diffrent ans
		 int t= r*e/r-e;
		 System.out.println(f);
		 System.out.println(t);
		// input kese lete hai
		 
		 Scanner sc=new Scanner(System.in);
		    String sername=sc.nextLine();
		    
		    
			System.out.println(sername);
			//input print area of circle by user
			
			
				    double radius,area;
				    Scanner input=new Scanner (System.in);
				  
				    System.out.println("enter the value of r");
				    radius=input.nextDouble();
				    input.close();
				    
				    area = Math.PI * radius * radius;
				     System.out.println("area of circle is"+ area);
				     //table print
				     
				     
				     
	}
}
	
	
				   
				     
				    
				
			

			
		 
		 
		

	


