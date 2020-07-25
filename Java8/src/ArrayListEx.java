import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Collections.synchronizedCollection(c);
		List<String> list = new ArrayList<>();
		
		list.add("wel");
		list.add("One");
		list.add("two");
		list.add("three");
		
		System.out.println(list);
		//list.remove("wel");

		for(String s: list)
		{
			if(s.equals("wel"));
			{
				list.remove("wel");
				break;
			}
		}
		//list.removeIf(s->s.equals("wel"));
		System.out.println(list);
		
	
		ArrayList<Integer> d = new ArrayList<Integer>();
        d.add(2);
        d.add(4);
        d.add(5);
        d.add(7);
        d.add(8);
        d.add(8);
        d.add(9);
        d.add(9);

        ArrayList<Integer> e = new ArrayList<Integer>();
        e.add(3);
        e.add(7);

      /*  List<Integer> temp = new ArrayList<Integer>(e);

        System.out.println("d --> " + d);
        System.out.println("e --> " + e);

        e.removeAll(d);
        temp.removeAll(e);

        System.out.println("e (unique)--> " + e);
        System.out.println("temp (duplicate) --> " + temp);
		
        List<Integer> uniqueElementsFromBothList = new ArrayList<>();
        List<Integer> commonElementsFromBothList = new ArrayList<>();

        // Duplicate/Common elements from both lists
        commonElementsFromBothList.addAll(
                 d.stream()
                .filter(str -> e.contains(str))
                .collect(Collectors.toList()));
        System.out.println("commonElementsFromBothList --> " + commonElementsFromBothList);
        // Unique element from listOne
        uniqueElementsFromBothList.addAll(
                 d.stream()
                .filter(str -> !d.contains(str))
                .collect(Collectors.toList())); 
        System.out.println("uniqueElementsFromBothList --> " + uniqueElementsFromBothList);

        // Unique element from listOne and listTwo 
        // Here adding unique elements of listTwo in existing unique elements list (i.e. unique from listOne)
        uniqueElementsFromBothList.addAll(
                 e.stream()
                .filter(str -> !d.contains(str))
                .collect(Collectors.toList()));
        System.out.println("uniqueElementsFromBothList --> " + uniqueElementsFromBothList);

        */
        
        ConcurrentHashMap
    	Collections.synchronizedCollection(d);
        ArrayList<Integer> pinklist = d;
        ArrayList<Integer> normallist = e;
        ArrayList<Integer> duplicatevalues = new ArrayList<Integer>();
        ArrayList<Integer> uniquevalues = new ArrayList<Integer>();

        for (Integer finalval : pinklist) {
            if (!normallist.contains(finalval)) {
                uniquevalues.add(finalval);
            } else
                duplicatevalues.add(finalval);
           
        }
        
        System.out.println("duplicatevalues --> " + duplicatevalues);
        System.out.println("uniquevalues --> " + uniquevalues);

	}

}
