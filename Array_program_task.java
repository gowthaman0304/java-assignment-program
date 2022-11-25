public class Array_program_task 
{
	public static void main(String[] args) {
		Array_program_task  ap =new Array_program_task ();
		int[] array= {0,10,5,3,5,7,1,2,8};
        System.out.println("Sum of elements 10");
        ap.sum_of_elements_10(array);
	    System.out.println();
        System.out.println("Multiply of elements 20");
        int[] ar= {2,10,4,8,5,9};
	    ap.multiply_of_elements_20(ar);
        System.out.println();
        System.out.println("Non repeted character");
        ap.find_non_repeated_element();
     }
void find_non_repeated_element() 
   {
		String name ="gowtham";
	    char[] ch=name.toCharArray();
        
	    for(int j=0;j<ch.length-1;j++)
	    {	
	    char c =ch[j];
	    int count=1;
	    for(int i=j+1;i<ch.length;i++)
	    {
	    	if(c==ch[i])
	    	{
	    		count++;
                
	    	break;
	    	}
	    	
	    }
	    if(count==1 ) 
	    {
	    System.out.println(c);
	    break;
	    }
	    

     }
	}


	void multiply_of_elements_20(int[] ar) 
	{

		for(int i=0;i<ar.length-1;i++)
	{
		int val=ar[i];
	
		for(int j=i+1;j<ar.length;j++)
		{
			if(val*ar[j]==20)
			{
				System.out.println(val+" "+ar[j]);
			}
		}
	}	
	}
void sum_of_elements_10(int[] array)
{
for(int i=0;i<array.length-1;i++)
{
int val=array[i];
for(int j=i+1;j<array.length;j++)
{
	if(val+array[j]==10)
	{
		System.out.println(val+ " "+array[j]);
	}
}
}
}

}

