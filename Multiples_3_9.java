class Multiples_3_9
{
public static void main(String[] args)
{
Multiples_3_9 mp=new Multiples_3_9();
mp.multiples_3_9();
System.out.println();
mp.using_or();
}
void multiples_3_9()
{
int num=1;
while(num<=30)
{
if(num%3==0 && num%9==0)
{
System.out.print(num+"\t");
}
num=num+1;
}
}
void using_or()
{
int num=1;
while(num<=30)
{
if(num%3==0 || num%9==0)
{
System.out.print(num+"\t");
}
num=num+1;
}
}

}
