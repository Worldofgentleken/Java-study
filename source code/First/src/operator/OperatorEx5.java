package operator;

public class OperatorEx5 {

	public static void main(String[] args) {
		int num = 0B00000101;
		
		System.out.println(num);
		System.out.println(num << 2);
		System.out.println(num >> 2);
		System.out.println(num >>> 2);
		
		num = num << 2;
		System.out.println(num);
		
	}

}
