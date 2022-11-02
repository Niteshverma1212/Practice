package practice;

import java.util.Scanner;

public class Loop {
	public void main() {
		int i;
		System.out.println("ENTER THE NUMBERS");
		Scanner s=new Scanner(System.in);
		i=s.nextInt();
		for (i=0;i<100;i=i+3) {
			System.out.println("Print i = "  +i);
		}
	}

	public static void main(String[] args) {
		Loop l=new Loop();
		l.main();
	}

	
	}
