package practice;

import java.util.Scanner;

public class QuotientandRem {
	public static void main(String[] args) {
		int divider;
		int divisor;
		Scanner s=new Scanner(System.in);
		System.out.println("Value of divider:");
		divider=s.nextInt();
		//System.out.println("Value of divider: "+divider);
		System.out.println("Value of divisor: ");
		divisor=s.nextInt();
		//System.out.println("Value of : "+divider);
		int quoitent=divider/divisor;
		int reminder=divider%divisor;
		System.out.println("quotient: "+quoitent);
		System.out.println("reminder: "+reminder);
		
	
	}

}
