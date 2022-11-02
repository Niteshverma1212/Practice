package practice;

import java.util.Scanner;

public class Printnum {
	public void num() {
		int i;
		System.out.println("Printing five times..............");
		Scanner s=new Scanner(System.in);
		i=s.nextInt();
		for(i=0;i<5;i++) {
			System.out.println("five Numbers  "  +i);
		}
		
	}
	public static void main(String[] args) {
		Printnum n=new Printnum();
		n.num();
	}

}
