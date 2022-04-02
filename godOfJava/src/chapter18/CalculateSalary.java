package chapter18;

public class CalculateSalary {
	public long getSalaryIncrease(Employee employee) {
		int val = employee.getType();
		long sal = employee.getSalary();
		
		switch (val) {
		case 1:
			employee.setType(1);
			sal = (long) (sal * 0.05);
			break;
		case 2:
			employee.setType(2);
			sal = (long) (sal * 1.1);
			break;
		case 3:
			employee.setType(3);
			sal = (long) (sal * 1.2);
			break;
		case 4:
			employee.setType(4);
			sal = (long) (sal * 1.3);
			break;
		case 5:
			employee.setType(5);
			sal = (long) (sal * 2);
			break;
		default:
			break;
		}
		return sal;
	}
	
	public void calculateSalaries() {
		Employee[] employees = new Employee[5];
		employees[0] = new Employee("LeeDaeRi", 1, 1000000000);
		employees[1] = new Employee("KimManager", 2, 100000000);
		employees[2] = new Employee("WhangDesign", 3, 70000000);
		employees[3] = new Employee("ParkArchi", 4, 80000000);
		employees[4] = new Employee("LeeDevelop", 5, 60000000);
		
		for(int i = 0; i < 5;  i++) {
			long sal = getSalaryIncrease(employees[i]);
//			employees[i].getSalary()
//			System.out.println(employees[i].getName() + "=" + employees[i].getSalary());
			System.out.println(employees[i].getName() + "=" + sal);
		}
	}
	
	public static void main(String[] args) {
		CalculateSalary sample = new CalculateSalary();
		sample.calculateSalaries();
	}

}
