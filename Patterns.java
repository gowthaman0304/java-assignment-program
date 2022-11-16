class Patterns
{
public static void main(String[] args)
{
Patterns p1=new Patterns();
p1.print12345();
p1.print11111();
p1.pattern4();
p1.pattern5();
}
void print12345()
{
for(int row=1;row<=5;row++)
{
for(int num=1;num<=6-row;num++)
{
System.out.print((num*row)+" ");
}
System.out.println();
}
}
void print11111()
{
for(int row=1;row<=5;row++)
{
for(int num=1;num<=6-row;num++)
{
System.out.print(row+" ");
}
System.out.println();
}
}
void pattern4()
{
for(int row=1; row<=5; row++)
{
 for(int col= 1; col<=5-row; col++)
  {
  System.out.print(" "+" "); 
  }
for(int col=1;col<=row;col++)
System.out.print(col+ " "); 
System.out.println(); 
}

}
void pattern5()
{
for(int row=1; row<=5; row++)
{
 for(int col= 1; col<=5-row; col++)
  {
  System.out.print(" "+" "); 
  }
for(int col=1;col<=row;col++)
System.out.print("*"+ "   "); 
System.out.println(); 
}

}
}
