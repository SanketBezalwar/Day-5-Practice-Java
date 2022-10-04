import java.util.Scanner;

public class Greatest_Number {

	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number : ");
		num1 = sc.nextInt();
		System.out.print("Enter Second Number : ");
		num2 = sc.nextInt();
		System.out.print("Enter Third Number : ");
		num3 = sc.nextInt();

		if (num1 > num2 && num1 > num3)
			System.out.println(num1 + " is Greater Number");
		else if (num2 > num3)
			System.out.println(num2 + " is Greater Number");
		else
			System.out.println(num3 + " is Greater Number");
	}

}
