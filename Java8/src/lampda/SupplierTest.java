package lampda;

import java.util.function.BinaryOperator;
import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		
		Supplier<String> supplier= () ->  "Welcome To Stream API";

		System.out.println(supplier.get());
	
		BinaryOperator<Integer> add= (n1,n2) ->  n1+n2;
		BinaryOperator<Integer> sub= (n1,n2) ->  n1-n2; 
		
		System.out.println(add.apply(12, 34));
		System.out.println(sub.apply(12, 34));
	}

}
