import java.util.Arrays;

public class RemoveDuplicateFromStringArray {

	public static void main(String[] args)
	{
	String[] strColors = {
	        "red",
	        "blue",
	        "green",
	        "red", //duplicate
	        "yellow",
	        "green"    //duplicate            
	};
	 
	System.out.println(Arrays.stream(strColors).distinct());
	strColors = Arrays.stream(strColors).distinct().toArray(String[]::new);
	 
	System.out.println("Array after removing duplicates: " 
	+ Arrays.toString(strColors));
}
}