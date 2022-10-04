import java.util.Scanner;

public class Power_Of_2 {
	static int num;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of times to print table of the Powers of 2 :");
		num = sc.nextInt();

		System.out.println();
		System.out.println("Printing all till Power Value " + num);

		for (int i = 1; i <= num; i++) {
			System.out.println("Power of 2^" + i + " is: " + (Math.pow(2, i)));
		}
	}
}
