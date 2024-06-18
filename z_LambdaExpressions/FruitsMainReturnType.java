package z_LambdaExpressions;

public class FruitsMainReturnType {
	public static void main(String[] args) {
		//
		FruitsMango fruitsMango=new FruitsMango();
		System.out.println("Mango price is "+fruitsMango.fruitPrice());
		
		//Anonymous function
		FruitsInterface fruitsInterface=new FruitsInterface() {
			@Override
			public double fruitPrice() {
				return 80.56;
			}
		};
		System.out.println("\nInterface : Price is "+fruitsInterface.fruitPrice());
		
		//Lambda Expressions single line
		FruitsInterface fruitsInterface1=()->120;
		System.out.println("\nLambda single : Price is "+fruitsInterface1.fruitPrice());
		
		//Lambda Expressions multi line
		FruitsInterface fruitsInterface2=()->{
			System.out.println("\nLambda multi");
			return 150;
		};
		System.out.println("Price is "+fruitsInterface2.fruitPrice());
		
		//
	}
}
