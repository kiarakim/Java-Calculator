package chapter22;

import java.util.ArrayList;

public class ListSample {

	public static void main(String[] args) {
		ListSample sample = new ListSample();
//		sample.checkArrayList2();
//		sample.checkArrayList3();
//		sample.checkArrayList4();
//		sample.checkArrayList5();
		sample.checkArrayList6();
	}
//	public void checkArrayList1() {
//		ArrayList<String> list2 = new ArrayList<String>(100);
//		list2.add("ArrayListSample");
//		System.out.println(list2);
//	}
	public void checkArrayList2() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add(1, "A1");
		
		for(String i:list) {
			System.out.println(i);
		}
	}
	public void checkArrayList3() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add(1, "A1");
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("0 ");
		list2.addAll(list);
		for(String i:list2) {
			System.out.println(i);
		}
	}
	public void checkArrayList4() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		
		ArrayList<String> list2 = list;
		list.add("Ooops");
		for(String i:list2) {
			System.out.println("List2 " + i);
		}
	}
	public void checkArrayList5() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		int listSize = list.size();
		for(int loop = 0; loop < listSize; loop++) {
			System.out.println("list.get(" + loop + ") = " + list.get(loop));
		}
	}
	public void checkArrayList6() {
		
	}

}