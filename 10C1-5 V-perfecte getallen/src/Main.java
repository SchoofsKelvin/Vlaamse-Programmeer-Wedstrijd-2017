import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			boolean found = false;
			for (int v = x; v <= y; v++) {
				int test = 0;
				for (int t = 1; t <= v; t++) {
					if (v % t == 0) {
						test += t;
					}
				}
				if (test % v == 0) {
					System.out.println(v + " " + test/v);
					found = true;
					break;
				}
			}
			if ( !found) {
				System.out.println("GEEN");
			}
		}

		sc.close();
	}

}
