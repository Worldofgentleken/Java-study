package classpart;

public class FunctionTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1,num2); //add()함수 호
		System.out.printf("%d + %d = %d 입니다.", num1, num2, sum);
	}
	public static int add(int n1, int n2) {
		int result = n1 + n2;	//add() 함
		return result;
	}

}
