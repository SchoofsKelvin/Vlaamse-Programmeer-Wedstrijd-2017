import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int appsPerScherm = sc.nextInt();
			int A = sc.nextInt();
			int O = sc.nextInt();
			ArrayList<Integer> A_getallen = new ArrayList<>();
			for (int j = 0; j < A; j++) {
				A_getallen.add(sc.nextInt());
			}
			ArrayList<Integer> O_getallen = new ArrayList<>();
			for (int j = 0; j < O; j++) {
				O_getallen.add(sc.nextInt());
			}
			int res = 0;
			for (int k = 0; k < O; k++) {
				int nummer = O_getallen.get(k);
				int index = A_getallen.indexOf(nummer);
				if (index == -1) throw new RuntimeException();
				res += index / appsPerScherm;
				if (index != 0) {
					A_getallen.remove(index);
					A_getallen.add(index - 1, nummer);
				}
			}
			System.out.println(i + 1 + " " + res);
		}

		sc.close();
	}

}
