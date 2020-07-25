package lampda;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;

public class TestFunction {

	public static void main(String[] args) {
		
		Function<String, String> fn= (str) -> str.toUpperCase();
		
		System.out.println(fn.apply("tom"));
		System.out.println(fn.apply("jack"));
		
		BiFunction<String, String, Integer> isAnagram=(str1,str2) ->{
			
			if(str1.length() == str2.length()) {
				if(sortChars(str1).equals(sortChars(str2)))
					return 0;
			}
			
			return 1;
		};
		
		System.out.println(isAnagram.apply("stop", "tops"));
		System.out.println(isAnagram.apply("stop", "pose"));
	}

	public static String sortChars(String str1) {
		char[] str1ch= str1.toCharArray();
		Arrays.sort(str1ch);
		str1=new String(str1ch);
		return str1;
	}
	
}
