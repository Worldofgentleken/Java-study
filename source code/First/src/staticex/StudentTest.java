package staticex;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.setStudentName("이순신");
		System.out.println(studentLee.serialNum);
		studentLee.serialNum++;
		
		Student studentSon = new Student();
		studentSon.setStudentName("손흥민");
		System.out.println(studentSon.serialNum);		
	}

}
