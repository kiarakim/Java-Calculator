package chapter15;

public class StrCheck {

	public static void main(String[] args) {
		StrCheck sample = new StrCheck();
		
		String addresses[] = new String[] {
			"서울시 송파구 방이동",
			"경기도 용인시 수지구 동천동",
			"서울시 송파구 잠실 롯데타워"
		};
		
//		sample.checkAddr(addresses);
//		sample.constainsAddr(addresses);
//		sample.checkMatch();
//		sample.checkSubstring();
//		sample.checkSplit();
//		sample.checkReplace();
//		sample.checkFormat();
		sample.internCheck();
	}
	
	public void checkAddr(String[] addr) {
		int startCnt = 0, endCnt = 0;
		String startTxt = "서울시";
		String endTxt = "동";
		for(String address : addr) {
			if(address.startsWith(startTxt)) {
				startCnt++;
			}
			if(address.endsWith(endTxt)) {
				endCnt++;
			}
		}
		System.out.println("Starts with " + startTxt + " count is " + startCnt);
		System.out.println("Ends with " + endTxt + " count is " + endCnt);
	}
	
	public void constainsAddr(String[] addr) {
		int containCnt = 0;
		String containTxt = "방이";
		for(String address : addr) {
			if(address.contains(containTxt)) {
				containCnt++;
			}
		}
		System.out.println("Contains " + containTxt + " count is " + containCnt);
	}
	
	public void checkMatch() {
		String text = "This is a text. Thanks"; 
		String compare1 = "is";
		String compare2 = "this";
		System.out.println(text.regionMatches(2, compare1, 0, 1));
		System.out.println(text.regionMatches(5, compare1, 0, 2));
		System.out.println(text.regionMatches(true, 0, compare2, 0, 4));
	}
	
	public void checkSubstring() {   
		String text = "Hello Java technology";
	    String technology = text.substring(5); 
	    System.out.println(technology);
	    String tech = text.substring(5, 9);
	    System.out.println(tech);
	}
	
	public void checkSplit() {
		String text = "Java technology is both a programming language and a platform";
		String[] splitStr = text.split(" ");
		for(int i = 0; i < splitStr.length; i++) {
			System.out.println("index " + i + " : " + splitStr[i]);
		}
	}
	
	public void checkReplace() {
		String text = "The String class represents character strings";
		System.out.println(text.replace('s', 'z'));
		System.out.println(text);
		System.out.println(text.replace("tring", "trike"));
		System.out.println(text.replaceAll(" ", "|"));
		System.out.println(text.replaceFirst(" ", "|"));
	}
	
	public void checkFormat() {
		String text = "제 이름은 %s입니다. 나이는 만으로 %d살이고, " + "하루에 %f%%의 시간을 공부하는데 할애하고 있습니다.";
		String printText = String.format(text, "Kiara", 23, 10.0);
		System.out.println(printText);
	}
	
	public void internCheck() {
		String text1 = "Java Basic";
		String text2 = "Java Basic";
		String text3 = new String("Java Basic");
		text3 = text3.intern();
		System.out.println(text1 == text2);
		System.out.println(text1 == text3);
		System.out.println(text1.equals(text3));
	}
}