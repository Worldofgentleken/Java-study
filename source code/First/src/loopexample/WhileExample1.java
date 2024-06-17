package loopexample;

public class WhileExample1 {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;

		while (num <= 10) { // num의 값이 10보다 작거나 같을 동안
			sum += num; // 합계를 뜻하는 sum에 num을 더하
			num++; // num에 1씩 더해 나간다.
		}
		System.out.printf("1부터 10까지의 합은 %d입니다.", sum);
	}

}
