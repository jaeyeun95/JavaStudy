package day6;

class Employee{
	String name;
	int employeeNo;
	int age;
	static String companyName = "s전자";
}
public class EmployeeTest {
	public static void main(String[] args) {
		Employee kim = new Employee();
		kim.name = "김종진";
		kim.employeeNo = 12345;
		kim.age = 45;
		System.out.println("kim의 회사명  : " + kim.companyName);
		
		Employee lee = new Employee();
		lee.name = "이선영";
		lee.employeeNo = 12346;
		lee.age = 39;
		lee.companyName = "LG전자";
		System.out.println("lee의 회사명  : " + lee.companyName);
		
		Employee park = new Employee();
		park.name = "박재성";
		park.employeeNo = 12347;
		park.age = 28;
		System.out.println("park의 회사명  : " + park.companyName);
		
	}
	

}
