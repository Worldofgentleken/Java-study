package loopexample;

public class CodingTest {

	public static void main(String[] args) {
		// 01 문제
		int num1 = 10;
		int num2 = 2;
		char operator = '+';

		switch (operator) {
		case '+':
			System.out.printf("연산의 값은 %d입니다.\n", num1 + num2);
			break;
		case '-':
			System.out.printf("연산의 값은 %d입니다.\n", num1 - num2);
			break;
		case '*':
			System.out.printf("연산의 값은 %d입니다.\n", num1 * num2);
			break;
		case '/':
			System.out.printf("연산의 값은 %d입니다.\n", num1 / num2);
			break;
		default:
		}
		// 02 문제
		int i;
		int j;
		for (i = 1; i <= 9; i++) {
			if (i % 2 != 0)
				continue;
			for (j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
			System.out.println();
		}
		// 03 문제
		int dan;
		int times;
		for (dan = 2; dan <= 9; dan++) {
			for (times = 1; times <= 9; times++) {
				if (dan < times)
					break;
				System.out.printf("%d x %d = %d\n", dan, times, dan * times);
			}
			System.out.println();
		}
		// 04 문제
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
	}
}