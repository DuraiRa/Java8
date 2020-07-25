package lampda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


class ConsImpl implements Consumer<Integer>
{

	@Override
	public void accept(Integer arg0) {
		
		System.out.println(arg0);
		
	}
	
}
public class Lampda1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> list = new ArrayList<Integer>(); 
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		//list.forEach(n->System.out.println(n));
		
		Consumer<Integer> c = new ConsImpl();
		list.forEach(c);
	}

}
