package oops_this_keyword;

//import java.util.Arrays;

public interface VehicleTrain {
	void firstBhogi();
	void lastBhogi();
	
	default void bhogi() {
//		System.out.println(Arrays.toString(this.getClass().getMethods()));
		System.out.println(this.getClass());
	}
}
