import java.util.ArrayList;
import java.util.Scanner;

public class sdfsdf {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();

		main: for (int i = 0; i < n; i++) {
			String input = sc.nextLine();
			inner: for (int j = 1; j < input.length(); j++) {
				// if (/* input.length() % j == 0 && */ input.length() / j >= 3)
				// {
				try {
					ArrayList<Integer> list = getList(input, j);
					if (list.size() < 3) {
						continue inner;
					}
					int min = list.get(0), max = list.get(list.size() - 1);
					Integer missend = null;
					boolean slecht = false;
					for (int getal = min; getal <= max; getal++) {
						if (list.contains(getal)) {} else if ( !slecht && missend == null) {
							missend = getal;
						} else {
							continue inner;
						}
					}
					if (missend != null) {
						System.out.println(i + 1 + " " + missend);
						continue main;
					}
				} catch (NumberFormatException e) {}
				// }
			}
			System.out.println(i + 1 + " geen ontbrekend getal");
		}

		sc.close();
	}

	private static String reverse(String input) {
		return new StringBuilder(input).reverse().toString();
	}

	private static int min(int a, int b) {
		return a < b ? a : b;
	}

	private static ArrayList<Integer> getList(String input, int len) {
		ArrayList<Integer> res = new ArrayList<>();
		int amount = input.length() / len;
		input = reverse(input);
		for (int i = 0; i * len < input.length(); i++) {
			String part =
				reverse(input.substring(i * len, min(i * len + len, input.length())));
			if (part.isEmpty()) {
				break;
			}
			res.add(0, Integer.valueOf(part));
		}
		return res;
	}

}
