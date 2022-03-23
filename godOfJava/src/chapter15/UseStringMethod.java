package chapter15;

public class UseStringMethod {

	public static void main(String[] args) {
		UseStringMethod sample = new UseStringMethod();
		String text = "The String class represents character strings.";
		sample.printWords(text);
		sample.findString(text, "string");
		sample.findAnyCaseString(text, "string");
		sample.countChar(text, 's');
		sample.pritContainWords(text, "ss");
	}
	
	public void printWords(String str) {
		String[] strArr = str.split(" ");
		for(String data : strArr) {
			System.out.println(data);
		}
	}
	
	public void findString(String str, String findStr) {
		System.out.println("string is appeared at " + str.indexOf(findStr));
	}
	
	public void findAnyCaseString(String str, String findStr) {
		str = str.toLowerCase();
		System.out.println("string is appeared at " + str.indexOf(findStr));
	}
	
	public void countChar(String str, char c) {
		char[] chrArr = str.toCharArray();
		int cnt = 0;
		for(char data : chrArr) {
			if(data == c)
				cnt++;
		}
		System.out.println("char 's' count is " + cnt);
	}
	
	public void pritContainWords(String str, String findStr) {
		String[] strArr = str.split(" ");
		for(String data : strArr) {
			if(data.contains(findStr))
				System.out.println(data + " contains " + findStr);
		}
	}
}
