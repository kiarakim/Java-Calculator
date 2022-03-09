package chapter03;

public class Profile3 {
	String name;
	int age;
	
	public static void main(String[] args) {
		Profile3 profile = new Profile3();
		profile.setName("Min");
		profile.setAge(20);
		profile.printName();
		profile.printAge();
	}
	public void setName(String str) {
		name = str;
	}
	public void setAge(int val) {
		age = val;
	}
	public void printName() {
		System.out.println("My name is " + name);
	}
	public void printAge() {
		System.out.println("My age is " + age);
	}

}
