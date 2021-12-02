package day8;
class Camera{
	String name;
	int sheets;
	
	public void takePicture() {
		System.out.println(name + "로 " + sheets + "번 사진을 찍는다");
	}
}

class PolaroidCamera extends Camera{
	int batteryGage;
	
	public void takePicture() {
		System.out.println(name + "로 " + sheets + "번 사진을 찍는다.");
		System.out.println(sheets + " 장의 사진을 프린트한다.");
		System.out.println("현재 배터리 : " + batteryGage + "%");
	}
}

public class OverridingTest2 {
	public static void main(String[] args) {
		PolaroidCamera camera = new PolaroidCamera();
		camera.name = "X-508";
		camera.sheets = 3;
		camera.batteryGage = 57;
		camera.takePicture();
	}

}
