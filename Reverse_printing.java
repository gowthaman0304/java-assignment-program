class Reverse_printing
{
public static void main(String[] args)
{
Reverse_printing rp =new Reverse_printing();
rp.find_reverse();


}
void find_reverse()
{
int num=5749;
int count=0;
while(num>0)
{
int rem=num%10;
System.out.println(rem);
count=count+1;
num=num/10;
}
System.out.println("Number of digits:"+count);
}
}
