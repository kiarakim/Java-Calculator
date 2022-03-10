package chapter05;

public class OperatorCasting {

	public static void main(String[] args) {
		OperatorCasting cast = new OperatorCasting();
		cast.casting();
		cast.casting2();
	}
	
	public void casting() {
		byte byteVal = 127;
		short shortVal = byteVal;
		shortVal++;
		System.out.println(shortVal);
		byteVal = (byte)shortVal;
		System.out.println(byteVal);
	}
	
	public void casting2() {
		short shortVal = 256;
		byte byteVal = (byte)shortVal;
		System.out.println(byteVal);
		shortVal = 255;
		byteVal = (byte)shortVal;
		System.out.println(byteVal);
	}
}
