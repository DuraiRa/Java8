import java.util.HashMap;
import java.util.Map;

public class DuplicateWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	/*	String text = "a r b k c d se f g a d f s s f d s ft gh f ws w f v x s g h d h j j k f sd j e wed a d f";
		 
        List<String> list = Arrays.asList(text.split(" "));
 
        Set<String> uniqueWords = new HashSet<String>(list);
        for (String word : uniqueWords) {
           // System.out.println(word + ": " + Collections.frequency(list, word));
        }*/
		
		
		String str = "Welcome to chennai";
	String strr[] = str.split(" ");
	System.out.println(str.split(" ").length-1);
		
	
final Map<String,String> ma = new HashMap<>();

	ma.put("one","kjjklj");
	ma.put("er","kjjklj");
	ma.put("sdfs","kjjklj");
	
	System.out.println(ma);
	
	 Map<String,String> ma1 = new HashMap<>();
	
	ma1=ma;
	
	System.out.println(ma1);
	
	}

}
