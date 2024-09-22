package muton.in.com.income;
import java.util.Scanner;

public class MuttonBotiTwo {



	    public static void main(String[] args)
	    {
	        // 1kg mutton BOTI is 500 rupees (as per the problem statement)
	        // User will enter mutton BOTI in grams

	        System.out.println("Enter mutton BOTI in grams:");
	        Scanner sc = new Scanner(System.in);
	        double muttonInGrams = sc.nextDouble();
	        System.out.println("Mutton BOTI value in grams is: " + muttonInGrams + " grams");

	        // Convert grams to kilograms
	        double muttonInKg = muttonInGrams / 1000;
	        System.out.println("Mutton BOTI value in kilograms is: " + muttonInKg + " kg");

	        // Input mutton price per kilogram
	        System.out.println("Please Enter mutton BOTI price per kilogram:");
	        double pricePerKg = sc.nextDouble();

	        // Calculate total cost
	        double totalCost = muttonInKg * pricePerKg;
	        System.out.println("The total cost for " + muttonInGrams + " grams of mutton BOTI is: " + totalCost + " rupees.");

	        sc.close();
	    }
	}


