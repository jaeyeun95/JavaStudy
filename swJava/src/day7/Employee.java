package day7;

public class Employee {
	String name;
	int age;
	int salary;
	int employeeNo;
	
	void setEmployee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void setEmployee(String name) {
		this.name = name;
	}
	void setEmployee() {
		name = "No Name";
		age = 0;
	}
	
	// 생성자 오버로딩 테스트
	// 기본생성자
//	public Employee() {}
	
	// 직원의 이름, 나이를 초기화하는 생성자
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 직원의 이름, 나이, 급여를 초기화하는 생성자
	public Employee(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	// this() 사용하여 중복되는 초기화 코드를 최소화 하는 경우
	public Employee() {
//		this.employeeNo = 0;
//		this.name = "Anonymity";
//		this.age = 0;
//		this.salary = 0;
		this(0, "Anonymity", 0, 0);
	}
	
	public Employee(int employeeNo, String name) {
		this.employeeNo = employeeNo;
		this.name = name;
	}
	public Employee(int employeeNo, String name, int age) {
		this(employeeNo, name);
//		this.employeeNo = employeeNo;
//		this.name = name;
		this.age = age;
	}
	public Employee(int employeeNo, String name, int age, int salary) {
		this(employeeNo, name, age);
//		this.employeeNo = employeeNo;
//		this.name = name;
//		this.age = age;
		this.salary = salary;
	}
	
	// 매개변수의 개수와 타입이 동일하면 오류가 발생
//	public Employee(String name, int age) {  매개변수의 개수와 타입이 동일하므로, Overloading 이라고 볼 수 없음
//		this.name = name;
//		this.age = age;
//	}
//	
//	public Employee(String name, int salary) {  // public Employee(int salary, String name) 으로 변경하면 매개변수의 위치가 변경되므로 Overloading이 가능
//		this.salary = salary;
//		this.name = name;
//	}

}
