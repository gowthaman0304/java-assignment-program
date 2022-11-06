class Divisors
{
public static void main(String[] args)
{
Divisors div =new Divisors();
div.find_divisor();

}
void find_divisor()
{
int num=26;
int div=1;
int count=0;
while(div<=26)
{
if(num%div==0)
{
System.out.println(div);
count=count+1;
}
div=div+1;
}
System.out.println("Number of divisors or:"+count);
}
}
