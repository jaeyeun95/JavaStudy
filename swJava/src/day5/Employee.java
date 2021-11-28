package day5;

public class Employee {
	// 멤버 변수
	private String name;	// 이름
	private int number;		// 사번
	private String dept;	// 근무 부서
	
	// 생성자
	public Employee(String name, int number, String dept) {
		this.name = name;
		this.number = number;
		this.dept = dept;
	}

	// 메서드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
}
