package constructor;

public class Person {
	String name;
	float height;
	float weight;
	
	public Person() { }		//디폴트 생성
	
	public Person(String pname) {
		 name = pname;		//이름을 매개변수로 받는 생성자
	}
	public Person(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight; 	//이름, 키, 몸무게를 매개변수로 받는 생성자 
		weight = pweight;
	}
}
