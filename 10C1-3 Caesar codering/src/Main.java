import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		byte[] bytes = new byte[27];
		bytes[0] = ' ';
		for (byte c = 'A'; c <= 'Z'; c++) {
			bytes[c - 64] = c;
		}

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int key = (sc.nextInt()%27+27)%27;
			if (key == 0) {
				System.out.println(sc.nextLine().substring(1));
				continue;
			}
			byte[] encoded = sc.nextLine().substring(1).getBytes();
			byte[] res = new byte[encoded.length];
			for (int j = 0; j < encoded.length; j++) {
				int b = encoded[j];
				if (b == ' ') {
					b = bytes[27 - key];
				} else if (b >= 'A' && b <= 'Z') {
					b = bytes[(b - 65 - key + 28) % 27];
				}
				res[j] = (byte) b;
			}
			System.out.println(new String(res));
		}

		sc.close();
	}

}
