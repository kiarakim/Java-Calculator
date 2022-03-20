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
		sample.checkSubstring();
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
		String text = "This is a text";
		String compare1 = "is";
		String compare2 = "this";
		System.out.println(text.regionMatches(2, compare1, 0, 1));
		System.out.println(text.regionMatches(5, compare1, 0, 2));
		System.out.println(text.regionMatches(true, 0, compare2, 0, 4));
	}
	
	public void checkSubstring() {   
		String text = "Java technology";
	    String technology = text.substring(5); 
	    System.out.println(technology);
	    String tech = text.substring(5, 9);
	    System.out.println(tech);
	}
}