import java.util.Arrays;
import java.util.Collections;

public class SortingArray {

	public static void main(String[] args) {
		
		
		Integer arr[] = { 12,5,14,8};
		int i,j = 0,temp ;
		
		/*for(i=0;i<arr.length;i++)
		{
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
					
				}
			}
			  
		        
		}
		
		 for (int k = 0; k < arr.length; k++) {     
	            System.out.println(arr[k] + " ");   
	}
		  System.out.println(arr[arr.length-2] + " ");  

		  
		  for(i=0;i<arr.length;i++)
			{
				for(j=i+1;j<arr.length;j++)
				{
					if(arr[i]<arr[j])
					{
						temp = arr[i];
						arr[i] = arr[j];
						arr[j]=temp;
						
					}
				}
				  
			        
			}
			
			 for (int k = 0; k < arr.length; k++) {     
		            System.out.println(arr[k] + " ");   
		}
			  System.out.println(arr[1] + " ");  
			  
			*/  

		
		Arrays.sort(arr,Collections.reverseOrder());
		
		 for (int k = 0; k < arr.length; k++) {     
	            System.out.println(arr[k] + " ");   
	}
}
}