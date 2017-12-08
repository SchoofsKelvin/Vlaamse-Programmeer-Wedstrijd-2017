import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		
		for (int i=0; i<k; i++) {
			int n = sc.nextInt(), res = 0;
			for (int j=n; j>0; j--) {
				res += j*j*j;
			}
			System.out.println(res);
		}

		sc.close();
	}

}
