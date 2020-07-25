package lampda;

import java.util.OptionalInt;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class DefaultStreamDemo {

	public static void main(String[] args) {
	
		//IntStream stream=IntStream.range(1, 11);
		IntStream stream=IntStream.of(1,23,45,456,34,34,3412,33, 11);
		//stream.forEach(System.out::println);
		DoubleStream stream2=DoubleStream.of(12.34,4.5,66.7,34,45.4534);
		stream2.forEach(System.out::println);
		
		OptionalInt minnum= stream.max();
		System.out.println(minnum.getAsInt());
	}

}
