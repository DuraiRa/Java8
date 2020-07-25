package lampda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> list = new ArrayList<Integer>(); 
		for (int i=10;i<=100;i++)
		{
		list.add(i);
		}
		
		//list.forEach(System.out::println);
	Stream<Integer> s=	list.stream();
	s.forEach(System.out::println);
	s.forEach(System.out::println);
	}

}
