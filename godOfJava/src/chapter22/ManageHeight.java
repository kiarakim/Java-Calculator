package chapter22;

import java.util.ArrayList;

public class ManageHeight {
	
	ArrayList<ArrayList<Integer>> gradeHeights = new ArrayList<ArrayList<Integer>>();
	ArrayList<Integer> gradeHeight;
	
	public static void main(String[] args) {
		ManageHeight sample = new ManageHeight();
		sample.setData();
		for(int i = 0; i < 5; i++) {
//			sample.printHeight(i);
			sample.printAverage(i);
		}
	}
	public void setData() {
		
		gradeHeight = new ArrayList<Integer>();
		gradeHeight.add(170); gradeHeight.add(180); gradeHeight.add(173); gradeHeight.add(175); gradeHeight.add(177);
		gradeHeights.add(gradeHeight);
		
		gradeHeight = new ArrayList<Integer>();
		gradeHeight.add(160); gradeHeight.add(165); gradeHeight.add(167); gradeHeight.add(186);
		gradeHeights.add(gradeHeight);
		
		gradeHeight = new ArrayList<Integer>();
		gradeHeight.add(158); gradeHeight.add(177); gradeHeight.add(187); gradeHeight.add(176);
		gradeHeights.add(gradeHeight);
		
		gradeHeight = new ArrayList<Integer>();
		gradeHeight.add(173); gradeHeight.add(182); gradeHeight.add(181);
		gradeHeights.add(gradeHeight);

		gradeHeight = new ArrayList<Integer>();
		gradeHeight.add(170); gradeHeight.add(180); gradeHeight.add(165); gradeHeight.add(177); gradeHeight.add(172);
		gradeHeights.add(gradeHeight);
		
	}
	public void printHeight(int classNo) {
		System.out.println("Class No.:" + classNo+1);
		for(int i = 0; i < gradeHeights.get(classNo).size(); i++) {
			System.out.println(gradeHeights.get(classNo).get(i));
		}
	}
	
	public void printAverage(int classNo) {
		System.out.println("Class No.:" + (classNo+1));
		double sum = 0;
		for(int i = 0; i < gradeHeights.get(classNo).size(); i++) {
			sum += gradeHeights.get(classNo).get(i);
		}
		sum /= gradeHeights.get(classNo).size();
		System.out.println("Height average:" + sum);
	}

}
