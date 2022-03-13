package chapter08;

public class ReferenceConstructor {
	
	public static void main(String[] args) {
		ReferenceConstructor reference = new ReferenceConstructor();
		reference.makeMemberObject();
	}
	
	public void makeMemberObject() {
		MemberDTO dto1 = new MemberDTO();
		MemberDTO dto2 = new MemberDTO("Dohee");
		MemberDTO dto3 = new MemberDTO("Dohee", "01012345678");
		MemberDTO dto4 = new MemberDTO("Dohee", "01012345678", "abc@naver.com");
	}

}
