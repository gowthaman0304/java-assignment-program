class Factorial
{
public static void main(String[] args)
{
Factorial fact=new Factorial();
fact.find_factorial();
}
void find_factorial()
{
int max=5;
int num=1;
int fact=1;
while(num<=max)
{
fact=fact*num;
num=num+1;
}
System.out.println(fact);
}
}
