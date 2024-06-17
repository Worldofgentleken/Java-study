package loopexample;

public class ContinueEx {

	public static void main(String[] args) {
		int i = 1;
		int total = 0;

		for (; i <= 100; i++) {
			if (i % 2 == 0)
				continue;
			total += i;
		}
		System.out.printf("1부터 100까지 홀수의 합은 %d입니다.", total);
	}

}
