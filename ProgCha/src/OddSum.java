import java.util.Scanner;

class OddSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int length = sc.nextInt();
		StringBuilder str = new StringBuilder();
		for (int i = 1; i <= length; i++) {
			str.append("Case " + i + ": " + oddsum(sc.nextInt(), sc.nextInt()) + "\n");
		}
		System.out.println(str.toString());
	}

	private static int oddsum(int a, int b) {
		b = (b+1)/2;
		a = (a)/2;
		return b*b - a*a;	
//		return oddsum(b)-oddsum(a-1);
	}
	
	private static int oddsum(int n){
		int m = (n+1)/2;
		return m*m;
	}

}