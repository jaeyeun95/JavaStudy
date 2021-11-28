package day5;

class Car3 {
	private int serialNumber;
	protected String name;
	int speed;
	
	public int getSerailNumber(int managerId) {
		if(managerId == 12345) {
			return serialNumber;
		}
		return 0;
	}
	
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
}
public class CarTest2 {
	public static void main(String[] args) {
		Car3 Yellow = new Car3();
		Yellow.name = "Lightening Yellow";
		Yellow.speed = 300;
		Yellow.setSerialNumber(4929);
//		Yellow.serailNumber = 2040;
		
		System.out.println(Yellow.name + " : " + Yellow.speed);
		System.out.println("Car No : " + Yellow.getSerailNumber(12345));
	}

}
