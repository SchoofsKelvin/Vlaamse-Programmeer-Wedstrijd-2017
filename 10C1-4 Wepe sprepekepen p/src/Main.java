import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();

		Pattern pattern = Pattern.compile("(ij|[aeiou]+)p\\1",Pattern.CASE_INSENSITIVE);

		for (int i = 0; i < n; i++) {
			String input = sc.nextLine();
			Matcher mat = pattern.matcher(input);
			System.out.println(mat.replaceAll("$1"));
		}

		sc.close();
	}

}
