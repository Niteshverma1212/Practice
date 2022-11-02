package practice;

public class Starpattern6 {
	public static void main(String[] args) {
		int r=5;
		for(int i=1;i<=r;i++) {
			for(int j=1;j<r;j++) {
				System.out.print("");
			}
			for(int j=i;j<r;j++) {
				System.out.print("* ");
			}
			for(int j=i;j<=r;j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
	}

}
