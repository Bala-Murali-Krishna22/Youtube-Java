package oops_Abstract;

public interface TeaInterface {
	public void milk();
	
	public void water();
	
	public void sugar();
	
	public void teaPowder();
	
	public void coffeePowder();
	
	default void lemonTea() {
		System.out.println("Lemon tea code");
	}
}
