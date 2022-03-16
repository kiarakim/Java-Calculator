package chapter14;

public class MultiCatchSample {

	public static void main(String[] args) {
		MultiCatchSample sample = new MultiCatchSample();
		sample.multiCatch();
	}
	
	public void multiCatch() {
		int[] intArray = new int[5];
		try {
			System.out.println(intArray[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException occured");
		} catch (Exception e) {
			System.out.println(intArray.length);
		}
	}

}
