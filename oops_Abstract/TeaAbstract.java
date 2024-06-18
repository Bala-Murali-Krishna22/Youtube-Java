package oops_Abstract;

public abstract class TeaAbstract implements TeaInterface{
	public void milk() {
		System.out.println("Milk code");
	}

	public void water() {
		System.out.println("Water code");
	}

	public void sugar() {
		System.out.println("Sugar code");
	}

	public abstract void teaPowder();

	public abstract void coffeePowder();
	
	public abstract void greenTea();
	
}
