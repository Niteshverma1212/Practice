package practice;

import java.util.Scanner;

public class Flipcoin {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Number:");
		int n=s.nextInt();
		double tails=0;
		double heads=0;
		for (int i=1;i<=n;i++) {
			if(Math.random()<0.5) {
				tails++;
				System.out.println("Tails");
			}
			else
			{
				heads++;
				System.out.println("Heads");
				
			}
				
		}
		double percentage_of_tail=(tails/n)*100;
		double percentage_of_head=(heads/n)*100;
		System.out.println("THE PERCENTAGE OF TAILS: "+percentage_of_tail);
		System.out.println("THE PERCENTAGE OF HEADS: "+percentage_of_head);
	/*	if(n<0) {
			System.out.println("Enter The Positive Number");
		}
		else {
		double m=Math.random();
		double percentageOfTail=m;
		double percentageOfHead=1-percentageOfTail;
	System.out.println("Percentage Of Tail: "+percentageOfTail);
	System.out.println("Percentage Of Head: "+percentageOfHead);*/
		
		
	}
}
