class Armstrong_Number
{
public static void main(String[] args)
{
Armstrong_Number an =new Armstrong_Number();
an.find_armstrong_number();
}
void find_armstrong_number()
{
int num=153;
int arm=0;
int num2=num;
while(num>0)
{
int rem=num%10;
rem=rem*rem*rem;
arm=rem+arm;
num=num/10;
}
if(num2 == arm)
{
System.out.println("Armstrong number");
}
else
{
System.out.println("Not Armstrong number")
}
}
}
