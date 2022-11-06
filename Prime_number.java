class Prime_number
{
public static void main(String[] args)
{
Prime_number pm =new Prime_number();
pm.find_prime_number();
}
void find_prime_number()
{
int num=11;
int div=1;
int count=0;
while(div<num)
{
if(num%div==0)
{
count=count+1;
}
div=div+1;
}
if(count==1)
{
System.out.println("prime number");
}
else{
System.out.println("not prime number");
}
}

}
