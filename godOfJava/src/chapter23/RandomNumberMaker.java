package chapter23;

import java.util.HashSet;
import java.util.Random;

public class RandomNumberMaker {

	public static void main(String[] args) {
		RandomNumberMaker sample = new RandomNumberMaker();
		for (int i = 0; i < 10; i++)
			System.out.println(sample.getSixNumber());
	}

	public HashSet<Integer> getSixNumber() {
		Random random = new Random();
		HashSet<Integer> set = new HashSet<Integer>();
		while(true) {
			set.add(random.nextInt(45));
			if(set.size() == 6)
				break;
		}
		return set;
	}
}
