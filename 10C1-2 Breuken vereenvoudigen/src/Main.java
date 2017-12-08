import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			String teller = sc.next();
			String noemer = sc.next();
			ArrayList<Byte> boven = new ArrayList<>(teller.length());
			ArrayList<Byte> onder = new ArrayList<>(teller.length());
			Comparator<Byte> comp = (a, b) -> {
				return a - b;
			};
			for (byte b : teller.getBytes()) {
				boven.add(b);
			}
			for (byte b : noemer.getBytes()) {
				onder.add(b);
			}
			boven.sort(comp);
			onder.sort(comp);
			StringBuffer tel = new StringBuffer();
			StringBuffer noe = new StringBuffer();
			for (byte b : boven) {
				if (onder.contains(b)) {
					onder.remove((Byte) b);
				} else {
					tel.append((char) b);
				}
			}
			for (byte b : onder) {
				noe.append((char) b);
			}
			if (tel.length() == 0) {
				tel.append('1');
			}
			if (noe.length() == 0) {
				noe.append('1');
			}
			System.out.println(tel.toString() + " " + noe.toString());
		}

		sc.close();
	}

}
