
/*
 * Write an application that asks a user to enter an integer. Display a statement that indicates whether the integer is even or odd. Save the file as EvenOdd.java. 
 */
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		//input
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		System.out.println("Please enter a whole number >> ");
		
		//mathy stuff
		if(num % 2 == 0) {
			displayEven();
		}else displayOdd();
	}
	
	public static void displayEven() {
		System.out.println("The number is even.");
	}
	
	public static void displayOdd() {
		System.out.println("The number is odd.");
	}
}
