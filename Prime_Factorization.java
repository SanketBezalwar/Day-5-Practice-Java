import java.util.Scanner;

public class Prime_Factorization {
	static int i;
	static int num;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to find Prime Factorization : ");
		num = sc.nextInt();
		System.out.println();
		System.out.println("The Prime Factors of " + num + " are : ");

		for (i = 2; i < num; i++) {
			while (num % i == 0) {
				System.out.println(i + " ");
				num = num / i;
			}
		}
		if (num > 2) {
			System.out.println(num);
		}
	}

}
