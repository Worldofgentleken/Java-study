package loopexample;

public class NestedLoop {

	public static void main(String[] args) {
		int dan;
		int times;

		for (dan = 2; dan <= 9; dan++) {
			for (times = 1; times <= 9; times++) {
				System.out.printf("%d x %d = %d \n", dan, times, dan * times);
			}
			System.out.println();
		}
	}

}
