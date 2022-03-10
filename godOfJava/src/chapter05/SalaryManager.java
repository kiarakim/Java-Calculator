package chapter05;

public class SalaryManager {

	public static void main(String[] args) {
		SalaryManager manager = new SalaryManager();
		int salary = 20000000;
		System.out.println(manager.getMonthlySalary(salary));
	}
	public double getMonthlySalary(int yearlySalary) {
		double mSal = yearlySalary / 12.0;
		double tax = calculateTax(mSal);
		double pension = calculateNationalPension(mSal);
		double insurance = calculateHealthInsurance(mSal);
		double total = tax + pension + insurance;
		
		mSal -= total;
		return mSal;
	}
	public double calculateTax(double monthSalary) {
		double tax = monthSalary * 0.125;
		return tax;
	}
	
	public double calculateNationalPension(double monthSalary) {
		double pension = monthSalary * 0.081;
		return pension;
	}
	
	public double calculateHealthInsurance(double monthSalary) {
		double insurance = monthSalary * 0.135;
		return insurance;
	}
}
