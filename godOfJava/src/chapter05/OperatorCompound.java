package chapter05;

public class OperatorCompound {
	int intValue = 10; 
	public static void main(String[] args) {
		OperatorCompound opr = new OperatorCompound();
		opr.compound();
	}
	
	public void compound() {
		System.out.println(intValue += 5);
		System.out.println(intValue -= 5);
		System.out.println(intValue *= 5);
		System.out.println(intValue /= 5);
		System.out.println(intValue %= 5);
	}
}
