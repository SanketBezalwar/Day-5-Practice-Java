import java.util.Scanner;

public class Coin_Flip {

	public static void main(String[] args) {

		int num;
		int head_count = 0;
		int tail_count = 0;

		double heads, tails;
		Coin_Flip cf = new Coin_Flip();

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number of Times You Want to Flip the Coin : ");

		num = cf.inputInteger();
		num = sc.nextInt();

		for (int i = 0; i < num; i++) {

			double random = Math.random();
			if (random < 0.5)
				head_count++;
			else
				tail_count++;
		}

		heads = head_count / (double) num * 100;
		System.out.println("Percentage of Heads : " + heads + " % ");

		tails = tail_count / (double) num * 100;
		System.out.println("Percentage of Tails : " + tails + " % ");

	}

	private int inputInteger() {
		return 0;
	}
}