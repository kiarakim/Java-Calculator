package chapter22;

import java.util.ArrayList;

public class ListSample {

	public static void main(String[] args) {
		ListSample sample = new ListSample();
		sample.checkArrayList1();
	}
	public void checkArrayList1() {
//		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>(100);
//		list1.add(new Object());
		list2.add("ArrayListSample");
//		list1.add(new Double(1));
		
		System.out.println(list2);
		
	}

}