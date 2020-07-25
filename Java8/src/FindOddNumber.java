import java.util.ArrayList;
import java.util.List;

public class FindOddNumber {

	public static void main(String[] args) {
		
		int L=3,R=7;

		int N = (R - L) / 2; 
		  
        // if either R or L is odd 
        if (R % 2 != 0 || L % 2 != 0) 
            N++; 
  
        System.out.println(N); 
        evenNumber();
	}
	
	public static void evenNumber()
	{
		int L=2,R=20;
		List<Integer> evenList = new ArrayList<>();
		for(int i=L;i<R;i++)
		{
			if(i%2==0)
			{
				evenList.add(i);
			}
		}
		
	
	System.out.println(evenList);
	}
	

}
