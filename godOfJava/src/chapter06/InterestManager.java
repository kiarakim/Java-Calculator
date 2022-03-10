package chapter06;

public class InterestManager {

	public static void main(String[] args) {
		InterestManager manager = new InterestManager();
		for(int i = 10; i <= 370; i += 10) {
			System.out.print("day " + i + " : ");
			System.out.println(manager.calculatorAmout(i, 1000000));
		}
	}
	
	public double getInterestRate(int day) {
		double rate = 0;
		if(day >= 1 && day <= 90) {
			rate = 0.005;
		}
		else if(day >= 91 && day <= 180) {
			rate = 0.01;
		}
		else if(day >= 181 && day <= 364) {
			rate = 0.02;
		}
		else if(day >= 365) {
			rate = 0.056;
		}
		return rate;
	}
	
	public double calculatorAmout(int day, long amount) {
		double rate = getInterestRate(day);
		double balance = amount;
		balance += amount * rate;
		return balance;
	}

}
