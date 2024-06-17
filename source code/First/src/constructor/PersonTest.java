package constructor;

public class PersonTest {

	public static void main(String[] args) {
			
		Person personLee = new Person();
		personLee.name = "이순신";
		personLee.height = 180.7F;  //디폴트 생성자로 클래스를 생성한 
		personLee.weight = 78.0F;   //인스턴스 변수 값을 따로 초기
		
		Person personKim = new Person("김유신", 175, 75); //인스턴스 변수 초기화와 동시에 클래스 생
	}

}
