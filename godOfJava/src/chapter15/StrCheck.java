package chapter15;

public class StrCheck {

	public static void main(String[] args) {
		StrCheck sample = new StrCheck();
		
		String addresses[] = new String[] {
			"����� ���ı� ���̵�",
			"��⵵ ���ν� ������ ��õ��",
			"����� ���ı� ��� �Ե�Ÿ��"
		};
		
//		sample.checkAddr(addresses);
//		sample.constainsAddr(addresses);
//		sample.checkMatch();
		sample.checkSubstring();
	}
	
	public void checkAddr(String[] addr) {
		int startCnt = 0, endCnt = 0;
		String startTxt = "�����";
		String endTxt = "��";
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
		String containTxt = "����";
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
}