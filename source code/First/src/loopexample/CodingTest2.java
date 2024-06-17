package loopexample;

public class CodingTest2 {

	public static void main(String[] args) {
		int numA;
		int numB;

		for (numA = 1; numA <= 7; numA++) {
			if (numA % 2 == 0)
				continue;
			for (numB = 7; numA < numB; numB--) {
				if (numB % 2 == 0)
					continue;
				System.out.print(" ");
			}
			for (numB = 0; numB < numA; numB++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (numA = 1; numA <= 5; numA++) {
			for (numB = 0; numB < numA; numB += 2) {
				System.out.print(" ");
			}
			for (numB = 6; numB > numA; numB--) {
				if (numA % 2 == 0)
					continue;
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
