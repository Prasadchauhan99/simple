package muton.in.com;

import java.util.Scanner;

public class MuttonShop {

	public static void main(String[] args) 
	{
		//1kg mutton is 500 rupees
		//mutton in grams
		
		System.out.println("Enter mutton BOTI in grams");
		Scanner sc= new Scanner(System.in);
		double m=sc.nextDouble();
		System.out.println("Mutton BOTI value in grams is"+m);
		//into kg
		double a=m/1000; 
		System.out.println("mutton  BOTI value in kilogram is"+a+"kg");
		
		System.out.println("Please Enter mutton BOTI amount as of the day::");
		double mp=sc.nextDouble();
		
		double c=mp/1000;
		System.out.println("c value"+c);
		
		double g=a*1000;
		System.out.println("g value"+g);
		
		
		double d=g*c;
		System.out.println("dvalue"+d);
		
		System.out.println("FOR 1 GRAM AMOUNT IS "+d);
		
		System.out.println("For 1000 grams OR 1kg of mutton BOTI amount is "+d+"/-"+" "+"rupees only");
		

	}

}
