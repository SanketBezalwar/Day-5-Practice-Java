import java.util.Scanner;

public class TwoD_Array {

	public static void main(String[] args) {
		int row, col;
		int i, j;
		int arr[][] = new int[10][10];

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Rows for the Array (max 10) : ");
		row = sc.nextInt();
		System.out.print("Enter Columns for the Array (max 10) : ");
		col = sc.nextInt();
		System.out.println();

		System.out.println("Enter " + (row * col) + " Array Elements : ");
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println();
		System.out.print("The Array is :\n");
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
