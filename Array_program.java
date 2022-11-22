class Array_program 
{
	public static void main(String[] args) {
		Array_program ap =new Array_program();
		int[] array= {83,63,88,89,94};
        ap.printArray(array);
        System.out.println("Reverse order");
        ap.revers_order(array);
        System.out.println();
        ap.even_elements(array);
        System.out.println();
        ap.odd_elements(array);
        System.out.println();
        ap.less_than_70(array);
        System.out.println();        
        ap.odd_index(array);
        System.out.println();        
        ap.even_index(array);
        System.out.println();        
        ap.odd_index_odd_elements(array);
        System.out.println();        
        ap.bighest_elements(array);   
        System.out.println();        
        ap.smallest_elements(array);
	  
}
void printArray(int[] values)
{
	int total=0;
	for(int i=0;i<values.length;i++) 
    {
	total=total+values[i];
    System.out.println(values[i]);    
}
	System.out.println("Total:"+total);
}
void revers_order(int[] values)
{
for(int i=values.length-1;i>=0;i--)
{
System.out.println(values[i]);
}
}
void even_elements(int[] values)
{
for(int i=0;i<values.length;i++)
{
if(values[i]%2==0)
System.out.println("Even numbers"+values[i]);
}
}
void odd_elements(int[] values)
{
for(int i=0;i<values.length;i++)
{
if(values[i]%2!=0)
System.out.println("Odd numbers"+values[i]);
}
}
void less_than_70(int[] values)
{
int mark=70;
for(int i=0;i<values.length;i++)
{
if(values[i]<mark)
System.out.println(values[i]);
}
}
void odd_index(int[] values)
{
for(int i=1;i<values.length;i+=2)
{
System.out.println(values[i]);
}
} 
void even_index(int[] values)
{
for(int i=0;i<values.length;i+=2)
{
System.out.println(values[i]);
}
}
void odd_index_odd_elements(int[] values)
{
for(int i=1;i<values.length;i+=2)
{
if(values[i]%2!=0)
System.out.println(values[i]);
}
} 
void bighest_elements(int[] marks)
{
int big=Integer.MIN_VALUE;
for(int i=0;i<marks.length;i++)
{
if(marks[i]>big){
big=marks[i];
}
}
System.out.println("Highest mark is"+" "+big);
}
void smallest_elements(int[] marks)
{
int small=Integer.MAX_VALUE;
for(int i=0;i<marks.length;i++)
{
if(marks[i]<small){
small=marks[i];
}
}
System.out.println("Lowest mark is"+" "+small);
}
}


