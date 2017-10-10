package sortedtable;

public class StringEx {
	public static void main(String[] args) {
		//extractString("1234567899");
		extractString("jamesbond9");
	}

	private static void extractString(String s) {

		int len = s.length();

		int noofdigit = numberOfDigits(len);

		System.out.println("::::::number of digits equals to::::::::::::::" + len);

		int imd = len - noofdigit;

		System.out.println(imd + "::::::::::imd::::");

		int finalDigits = numberOfDigits(imd);

		System.out.println("::finalDigits::" + finalDigits);

		if (finalDigits == noofdigit) {
			// System.out.println("::::::required output
			// length:::::::::::::"+(len-noofdigit));
			// System.out.println("::::::last
			// digits::::::::::::"+s.substring(len-noofdigit));
			if (Integer.parseInt(s.substring(len - noofdigit)) == imd) {

				System.out.println("::::::required output String:::::::::" + s.substring(0, (len - noofdigit)));
			} else {
				System.out.println("::::::::::Given String is invalid Specification:::::::::::");
			}

		}

		else {

			// System.out.println("::::::required output
			// length:::::::::::::"+(len-noofdigit+1));
			// System.out.println("::::::required output
			// String:::::::::"+s.substring(0,(len-noofdigit+1)));

			if (Integer.parseInt(s.substring(len - noofdigit + 1)) == imd) {

				System.out.println("::::::required output String:::::::::" + s.substring(0, (len - noofdigit + 1)));
			} else {
				System.out.println("::::::::::Given String is invalid Specification:::::::::::");
			}
		}
	}

	static int numberOfDigits(int n) {
		int count = 0;
		while (n > 0) {
			if (n == 0)
				break;
			n = n / 10;
			count++;
		}
		return count;
	}
}
