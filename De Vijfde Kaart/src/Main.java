import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String[] _kleuren = { "K", "R", "H", "S" }; // Koeken, Ruiten, Harten,
													// Schoppen
		String[] _rangen =
			{ "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "B", "V", "H" };
		ArrayList<String> kleuren = new ArrayList<>();
		ArrayList<String> rangen = new ArrayList<>();
		for (String kleur : _kleuren) kleuren.add(kleur);
		for (String rang : _rangen) rangen.add(rang);

		for (int i = 0; i < n; i++) {
			String[] kaarten = new String[4];
			for (int j = 0; j < 4; j++) {
				kaarten[j] = sc.next();
			}
			String kleur = kaarten[0].substring(0, 1);
			int punt = rangen.indexOf(kaarten[0].substring(1));
			int A = rangen.indexOf(kaarten[1].substring(1)) * 20 + kleuren.indexOf(kaarten[1].substring(0, 1));
			int B = rangen.indexOf(kaarten[2].substring(1)) * 20 + kleuren.indexOf(kaarten[2].substring(0, 1));
			int C = rangen.indexOf(kaarten[3].substring(1)) * 20 + kleuren.indexOf(kaarten[3].substring(0, 1));
			if (A < B && B < C && A < C) punt += 1;
			if (A < B && B > C && A < C) punt += 2;
			if (A > B && B < C && A < C) punt += 3;
			if (A < B && B > C && A > C) punt += 4;
			if (A > B && B < C && A > C) punt += 5;
			if (A > B && B > C && A > C) punt += 6;
			punt = (punt)%_rangen.length;
			System.out.println(i + 1 + " " + kleur + _rangen[punt]);
		}

		sc.close();
	}

}
