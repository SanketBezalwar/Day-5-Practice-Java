import java.util.Scanner;

public class Leap_Year {
	static int year;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Year : ");
		year = sc.nextInt();

		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
			System.out.println(year + " is a Leap year");
		else
			System.out.println(year + " is not a Leap year");
	}

}
