import java.util.Scanner;

public class AllInAll {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		loop : while (sc.hasNext()) {

			String[] input = sc.nextLine().split(" ");
			char[] s = input[0].toCharArray();

			// sequence subsequence Y
			// person compression N
			// VERDI vivaVittorioEmanueleReDiItalia Y
			// caseDoesMatter CaseDoesMatter N

			for (int i = 0; i < input[0].length(); i++) {
				try {
					input[1] = input[1].split(String.valueOf(s[i]), 2)[1];

				} catch (Exception e) {
					System.out.println("No");
					continue loop;
				}

			}

			System.out.println("Yes");

		}

	}

}
