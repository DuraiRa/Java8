package lampda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) {
		
		List<String> list= Arrays.asList("one","two","three","four","six","five","seven");
		
		Predicate<String> checkStr=(str)-> str.length()>3;
		Function<String, String> fn= (str) -> str.toUpperCase();
		
		//list.stream()
	//	List<String> result=
		//long count=
				//list.parallelStream()
	
	String result=list.stream()
			//.filter((str)-> str.length()>3)
			.filter(checkStr)
			.map(fn)
			//.count();
			.reduce("",(s1,s2)->s1.concat(s2));
	
			//.sorted(Collections.reverseOrder())
			//.forEach(System.out::println);
			//.collect(Collectors.toList());
		
		
	//	System.out.println(count);
		//System.out.println(result);
		//System.out.println(list);
	System.out.println(result);
	
	}

}
