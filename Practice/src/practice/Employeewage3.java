package practice;

public class Employeewage3 {
	public static void main(String[] args) {
			int PART_TIME=0;
			int EMP_RATE_PER_HOUR = 20;			
			int empwage = 0;
			double empCheck = Math.floor(Math.random()*10)%2;
			if (empCheck == 1)
				PART_TIME = 8 ;
			else {
				PART_TIME =0;
			 	}
			empwage = PART_TIME * EMP_RATE_PER_HOUR;
			System.out.println("emp wage: "+empwage);
		}
	

}
