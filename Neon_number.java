class Neon_number
{
public static void main(String[] args)
{
Neon_number nn=new  Neon_number();
nn.find_neon_number();
}
void find_neon_number()
{
int num=9;
int neon=0; 
int square=num*num;
while(square>0)
{
int rem=square%10;
neon=neon+rem;
square=square/10;
}
if(neon==num)
{
System.out.println("it is a neon number");
}
else
{
System.out.println("not neon number");
}
}
}
