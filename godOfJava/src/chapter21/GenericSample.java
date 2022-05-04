package chapter21;

public class GenericSample {

	public static void main(String[] args) {
		GenericSample sample = new GenericSample();
		sample.checkCastingDTO();
	}
	public void checkCastingDTO() {
		CastingDTO dto1 = new CastingDTO();
		dto1.setObject(new String());
		
		CastingDTO dto2 = new CastingDTO();
		dto2.setObject(new StringBuffer());
		
		CastingDTO dto3 = new CastingDTO();
		dto3.setObject(new StringBuilder());
		
		String temp1 = (String)dto1.getObject();
		StringBuffer temp2 = (StringBuffer)dto2.getObject();
		StringBuilder temp3 = (StringBuilder)dto3.getObject();
	}
	
	public void checkDTO(CastingDTO dto) {
		Object tempObject = dto.getObject();
		if(tempObject instanceof StringBuffer) {
			System.out.println("This is a StringBuffer!!");
		}else if(tempObject instanceof StringBuilder) {
			System.out.println("This is a StringBuilder!"); 
		}
	}
}
