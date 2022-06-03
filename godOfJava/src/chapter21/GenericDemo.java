package chapter21;

class EmpInfo{
	public int rank;
	EmpInfo(int rank) {this.rank = rank;}
}
class Person<T,S>{
	public T info;
	public S id;
	Person(T info, S id) {
		this.info = info;
		this.id = id;
	}
}
public class GenericDemo {
	public static void main(String[] args) {
		Integer id = new Integer(2);
		Person<EmpInfo, Integer> p1 = new Person<EmpInfo, Integer>(new EmpInfo(1), id);
		System.out.println(p1.id.intValue());
	}
}