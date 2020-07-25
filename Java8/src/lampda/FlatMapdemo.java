package lampda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMapdemo {

	public static void main(String[] args) {
		List<Integer> list1=Arrays.asList(1,2,3,4,5,6);
		List<Integer> list2=Arrays.asList(11,22,33,44,55,66);
		List<Integer> list3=Arrays.asList(10,20,30,40,50,60);

		List<List<Integer>> lists=new ArrayList<List<Integer>>();
		lists.add(list1);
		lists.add(list2);
		lists.add(list3);	
		System.out.println(lists);
		
		lists.parallelStream()
			.map((lst) -> lst.stream())
			.forEach(System.out::println);
		
		lists.parallelStream()
		.flatMap((lst) -> lst.stream())
		.forEach(System.out::println);
		
		
	}

}
