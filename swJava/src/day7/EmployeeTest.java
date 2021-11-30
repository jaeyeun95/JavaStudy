package day7;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee park = new Employee();
		park.setEmployee("박재성", 28);	// 7라인
		park.setEmployee();		// 15 라인 호출
	}

}
