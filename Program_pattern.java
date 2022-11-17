class Program_pattern
{
public static void main(String[] args)
{
Program_pattern pp =new Program_pattern();
pp.pattern1(); 
pp.pattern2(); 
}
private void pattern1() 
		{
			for(int row=5;row>=1;row--) {
		for(int num=5;num>=row;num--) 
		{	
		System.out.print(" "+" ");	
		}
		for(int num=5;num>=6-row;num--) {
			System.out.print(num+" ");
		}
			System.out.println();
			}
			}
		private void pattern2() 
		{
			for(int row=5;row>=1;row--) {
		for(int num=5;num>=row;num--) 
		{	
		System.out.print(" "+" ");	
		}
		for(int num=row;num>=1;num--) {
			System.out.print(num+" ");
		}
			System.out.println();
			}
			}
}
