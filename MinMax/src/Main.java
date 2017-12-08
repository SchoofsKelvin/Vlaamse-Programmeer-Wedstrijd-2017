import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int k = sc.nextInt();
			int first = sc.nextInt();
			int min = first, max = first;
			for (int j = 1; j < k; j++) {
				int val = sc.nextInt();
				min = val < min ? val : min;
				max = val > max ? val : max;
			}
			System.out.println((i + 1) + " " + min + " " + max);
		}

		sc.close();
	}

}
