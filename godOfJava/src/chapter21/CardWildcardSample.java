package chapter21;

public class CardWildcardSample {

	public static void main(String[] args) {
		CardWildcardSample sample = new CardWildcardSample(); 
//		sample.callBoundedWildcardMethod();
		sample.callBusBoundedWildcardMethod();
	}
	/*
	public void callBoundedWildcardMethod() {
		WildcardGeneric<Car> wildcard = new WildcardGeneric<Car>();
		wildcard.setWildcard(new Car("Mustang"));
		boundedWildcardMethod(wildcard);
	}
	*/
	
	public void callBusBoundedWildcardMethod() {
		WildcardGeneric<Bus> wildcard = new WildcardGeneric<Bus>();
		wildcard.setWildcard(new Bus("14"));
		boundedWildcardMethod(wildcard);
	}
	
	public void boundedWildcardMethod(WildcardGeneric<? extends Car> c) {
		Car value = c.getWildcard();
		System.out.println(value);
	}

}
