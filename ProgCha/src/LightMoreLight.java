import java.util.Scanner;

public class LightMoreLight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			
			long input = Long.valueOf(sc.nextLine());

			if (input == 0) {
				break;
			} else {

				
				
				double sqrt = Math.sqrt(input);
//				double sqrtR = sqrt - (int)sqrt;
//				double sqrtR = Math.sqrt(input) % 1;
				
				System.out.println(sqrt - (long)sqrt == 0 ? "yes" : "no");

			}
		}

	}

}
