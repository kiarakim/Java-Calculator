package chapter08;

public class ReferenceStatic {

	public static void main(String[] args) {
		ReferenceStatic.staticMethod(); // 객체 생성 없이 클래스 변수가 직접 호출
	}
	public static void staticMethod() {
		System.out.println("This is a staticMethod");
	}
}