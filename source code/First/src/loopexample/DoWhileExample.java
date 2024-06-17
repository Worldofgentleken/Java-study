package loopexample;

public class DoWhileExample {

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
		for (numA = 5; numA >= 1; numA--) {
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
	}
}
