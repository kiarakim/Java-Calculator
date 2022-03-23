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
//		sample.checkSubstring();
//		sample.checkSplit();
//		sample.checkReplace();
//		sample.checkFormat();
		sample.internCheck();
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
		String text = "�� �̸��� %s�Դϴ�. ���̴� ������ %d���̰�, " + "�Ϸ翡 %f%%�� �ð��� �����ϴµ� �Ҿ��ϰ� �ֽ��ϴ�.";
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