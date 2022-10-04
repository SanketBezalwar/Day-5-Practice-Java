import java.util.Scanner;

public class Swap_Two_Numbers {

	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First Number : ");
		num1 = sc.nextInt();
		System.out.print("Enter the Second Number : ");
		num2 = sc.nextInt();

		System.out.println();
		System.out.println("Before Swapping the Numbers are : ");
		System.out.println("The First Number is " + num1);
		System.out.println("The Second Number is " + num2);
		System.out.println();

		num3 = num1;
		num1 = num2;
		num2 = num3;

		System.out.println("After Swapping the Numbers are : ");
		System.out.println("The First Number is " + num1);
		System.out.println("The Second Number is " + num2);
	}

}
