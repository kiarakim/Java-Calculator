package chapter12;

public class ManageStudent {

	public static void main(String[] args) {
		//Student[] student = null;
		ManageStudent manage = new ManageStudent();
		//student = manage.addStudent();
		//manage.printStudents(student);
		manage.checkEquals();
	}
	
	public Student[] addStudent() {
		Student[] student = new Student[3];
		student[0] = new Student("Kim");
		student[1] = new Student("Kwon");
		student[2] = new Student("Lee", "Seoul", "010xxxxxxxx", "abc@naver.com");		
		return student;
	}
	
	public void printStudents(Student[] students) {
		for(Student data : students) {
			System.out.println(data);
		}
	}
	
	public void checkEquals() {
		Student a = new Student("Kiara", "Seoul", "010123241234", "abc@java.com");
		Student b = new Student("Kiara", "Seoul", "010123241234", "abc@java.com");
		
		if(a.equals(b)) 
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}

}
