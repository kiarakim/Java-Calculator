package chapter12;

public class Equals {

	public static void main(String[] args) {
		Equals thisObj = new Equals();
		thisObj.equalMethod();
	}
	
	public void equalMethod() {
		infoDTO obj1 = new infoDTO("Kiara");
		infoDTO obj2 = new infoDTO("Kiara");
		if(obj1.equals(obj2)) {
			System.out.println("obj1 and obj2 is same");
		} else {
			System.out.println("obj1 and obj2 is different");
		}
	}
}
