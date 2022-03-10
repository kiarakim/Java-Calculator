package chapter05;

public class OperatorComparison {

	public static void main(String[] args) {
		OperatorComparison com = new OperatorComparison();
		com.comparison();
	}
	
	public void comparison() {
		char charValue = 'a';
		System.out.println(97 == charValue);
		double doubleValue = 1.0;
		System.out.println(1 == doubleValue);
		boolean booleanValue = false;
		System.out.println(true == booleanValue);
	}

}
