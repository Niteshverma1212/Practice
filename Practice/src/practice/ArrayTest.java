package practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
	    // create Scanner class object to take input
	    Scanner scan = new Scanner(System.in);

	    // read size of the array
	    System.out.print("Enter size of the array: ");
	    int n = scan.nextInt();

	    // create an int array of size n
	    int numbers[] = new int[n];

	    // take input for the array
	    System.out.println("Enter array elements: ");
	    for (int i = 0; i < n; ++i) {
	      numbers[i] = scan.nextInt();
	    }

	    // remove odd numbers
	    int newArr[] = removeOdd(numbers);

	    // display new array
	    System.out.println("Array after removing odd numbers: " 
	                      + Arrays.toString(newArr));

	    // close Scanner
	    scan.close();

	  }

	  // method to display even or odd in array
	  public static int[] removeOdd(int[] numbers) {

	    // variables
	    int countEven = 0;
	    int even[] = null;

	    // count even numbers
	    for (int i : numbers) {
	      if (i % 2 == 0)
	        ++countEven;
	    }

	    // create array to store even numbers
	    even = new int[countEven];

	    // check each element and insert
	    int i = 0;
	    for (int num : numbers) {
	      if (num % 2 == 0) { // even
	        even[i++] = num;
	      }
	    }

	    // return
	    return even;
	  }
	}



