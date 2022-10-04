import java.util.Scanner;

public class Harmonic {

	public static void main(String[] args) {

		double num = 0, sum = 0, i;
		int n;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		n = sc.nextInt();

		for (i = 1; i <= n; i++) {
			sum = sum + (1 / i);
			num = sum;
		}
		System.out.println("The Harmonic Value of " + n + " is " + num);

	}

}
