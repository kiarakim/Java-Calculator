package chapter15;

public class StringSample {

	public static void main(String[] args) {
		StringSample sample = new StringSample();
		sample.convert();
//		sample.convertUTF16();
	}
	
	public void convert() {
		try {
			String korean = "자바의 신 최고!!";
			byte[] array1 = korean.getBytes();
			printByteArr(array1);
			String korean2 = new String(array1);
			System.out.println(korean2);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void printByteArr(byte[] arr) {
		for(byte data: arr) {
			System.out.print(data + " ");
		}
		System.out.println();
	}
	
	public void convertUTF16() {
		try {
			String korean = "자바의 신 최고!!";
			byte[] array1 = korean.getBytes("UTF-16");
			printByteArr(array1);
			String korean2 = new String(array1, "UTF-16");
			System.out.println(korean2);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
