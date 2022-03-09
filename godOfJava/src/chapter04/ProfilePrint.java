package chapter04;

public class ProfilePrint {
	byte age;
	String name;
	boolean isMarried;
	
	public static void main(String[] args) {
		ProfilePrint prof = new ProfilePrint();
		byte age = 25;
		String name = "Kim";
		boolean isMarried = false;
		
		prof.setAge(age);
		prof.setName(name);
		prof.setMarried(isMarried);
		
		System.out.println(prof.getAge());
		System.out.println(prof.getName());
		System.out.println(prof.isMarried());
	}
	
	public void setAge(byte paraAge) {
		age = paraAge;
	}
	public byte getAge() {
		return age;
	}
	public void setName(String paraName) {
		name = paraName;
	}
	public String getName() {
		return name;
	}
	public void setMarried(boolean flag) {
		isMarried = flag;
	}
	public boolean isMarried() {
		return isMarried;
	}
}
