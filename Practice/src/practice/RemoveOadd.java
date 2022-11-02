package practice;

import java.util.Scanner;

public class RemoveOadd {
	public void oddelements(){
			int[] arr= new int [10];
			System.out.println("Elements Are: ");
			Scanner s=new Scanner(System.in);
			for(int i=0;i<arr.length-1;i++) {
				arr[i] =s.nextInt();{
			}
				if(arr[i]%2!=0) {	
					System.out.println(arr[i]+ " ");
				}
	}
	}
	public static void main(String[] args) {
		RemoveOadd obj=new RemoveOadd();
		obj.oddelements();
		
		
	}
}