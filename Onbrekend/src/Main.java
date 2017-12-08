import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();

		main: for (int i = 0; i < n; i++) {
			String input = sc.nextLine();
			for (int j = 1; j < input.length(); j++) {
				try {
					int min = Integer.valueOf(input.substring(0, j));
					String subpart = input.substring(j + 1);
					Integer res = checkCorrect(input, min);
					if (res != null) {
						System.out.println(i + 1 + " " + res);
						continue main;
					}
				} catch (Exception e) {

				}
			}
			System.out.println(i + 1 + " geen ontbrekend getal");
		}

		sc.close();
	}

	private static Integer checkCorrect(String input, int min) {
		int num = min;
		Integer derp = null;
		while (true) {
			if (input.isEmpty()) {
				return derp;
			} else if ( !input.startsWith("" + num)) {
				if (derp != null) {
					return null;
				} else {
					derp = num;
				}
			} else {
				String idk = ""+num;
				input = input.substring(idk.length());
			}
			num++;
		}
	}

}
