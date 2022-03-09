package chapter04;

public class PrimitiveTypes {

	public static void main(String[] args) {
		PrimitiveTypes types = new PrimitiveTypes();
		types.checkByte();
		types.checkChar();
		types.checkBoolean();
	}
	
	public void checkByte() {
		byte byteMin = -128;
		byte byteMax = 127;
		System.out.println("byteMin = " + byteMin);
		System.out.println("byteMax = " + byteMax);
		byteMin = (byte)(byteMin - 1);
		byteMax = (byte)(byteMax + 1);
		System.out.println("byteMin - 1 = " + byteMin);
		System.out.println("byteMax + 1 = " + byteMax);
	}
	
	public void checkChar() {
		char charMin = '\u0000';
		char charMax = '\uffff';
		System.out.println("charMin = [" + charMin + "]"); //공백출력
		System.out.println("charMax = [" + charMax + "]"); //?출력
	}
	
	public void checkBoolean() {
		boolean flag = true;
		System.out.println(flag);
		flag = false;
		System.out.println(flag);
	}

}
