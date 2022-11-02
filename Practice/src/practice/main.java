package practice;

import java.util.Scanner;

public class main {
	public void one() {
		int n;
		System.out.println("Enter number" );
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.println(i+ " ");
			}
		
	}
	public static void main(String[] args) {
	main o=new main();
	o.one();
		
		}
	}

