import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			double amount = 0, max = 0;
			while (true) {
				int next = sc.nextInt();
				if (next < 0) break;
				max = max > next ? max : next;
				amount++;
			}
			double res = (amount+1) * max / amount - 1;
			int rounded = (int) (res+0.5);
			System.out.println((i+1) + " " + rounded);
		}

		sc.close();
	}

}
