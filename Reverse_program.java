class Reverse_program
{
public static void main(String[] args)
{
Reverse_program Rp =new Reverse_program();
Rp.reverse();
System.out.println();
Rp.reverse2();
}
// input=456789   output=987654 
void reverse()
{
int num=456789;

while(num>0)
{
int rem=num%10;
System.out.print(rem);
num=num/10;
}
}
//input= 456789  output=896745
void reverse2()
{
int num=456789;

while(num>0)
{
int rem=num%100;
System.out.print(rem+" ");
num=num/100;
}

}
}
