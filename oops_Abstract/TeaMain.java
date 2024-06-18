package oops_Abstract;

public class TeaMain {
	public static void main(String[] args) {
		TeaTime teatime=new TeaTime();
		TeaHours teahours=new TeaHours();
		
		teatime.milk();
		teatime.water();
		teatime.sugar();
		teatime.teaPowder();
		teatime.coffeePowder();
		teatime.greenTea();
		teatime.lemonTea();
		teatime.roseMilk();
		System.out.println();
		
		teahours.milk();
		teahours.water();
		teahours.sugar();
		teahours.teaPowder();
		teahours.coffeePowder();
		teahours.greenTea();
		teahours.lemonTea();
	}
}