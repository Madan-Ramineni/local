import java.util.Scanner;

public class Test {
	public static void main(String args[]) {

		// Scanner
		Scanner s = new Scanner(System.in);
		int limit=s.nextInt();
		int a[] = new int[limit];
		for (int i = 0; i < limit ; i++) {
			a[i] = s.nextInt();
		}

		double pro = 1.0;
		for (int i = 0; i <= limit-1; i++) {
			pro = (pro * a[i]) % ((Math.pow(10, 9)) + 7);
		}

		System.out.println((int) pro);
		s.close();
	}
}
