package chapter05;

public class OperatorUnary {

	public static void main(String[] args) {
		OperatorUnary una = new OperatorUnary();
		una.unary();
	}
	
	public void unary() {
		int intVal = 5;
		System.out.println(+intVal);
		System.out.println(-intVal);
		System.out.println(intVal++);
		System.out.println(intVal);
		System.out.println(++intVal);
		System.out.println(intVal--);
		System.out.println(intVal);
		System.out.println(--intVal);
	}
}
