package chapter17;

public class AnnotaionOverride extends Parent{
	@Override
	public void printName() {
		System.out.println("AnnotationOverride");
	}
//	
//	@Override
//	public void printName(String args) {
//		System.out.println("AnnotationOverride");
//	}

	public static void main(String[] args) {
		AnnotaionOverride over = new AnnotaionOverride();
		over.printName();
//		over.printName(null);
	}

}
