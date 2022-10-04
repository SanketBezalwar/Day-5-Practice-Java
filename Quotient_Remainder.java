import java.util.Scanner;

public class Quotient_Remainder {

	public static void main(String[] args) {
		int num1;
		int num2;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Dividend : ");
		num1 = sc.nextInt();
		System.out.print("Enter the Divisor : ");
		num2 = sc.nextInt();
		System.out.println();

		int quotient = num1 / num2;
		int remainder = num1 % num2;

		System.out.println("After dividing " + num1 + "/" + num2);
		System.out.println("Quotient is " + quotient);
		System.out.println("Remainder is " + remainder);

	}

}
