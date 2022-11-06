class Sum_of_digits
{
public static void main(String[] args)
{
Sum_of_digits sd = new Sum_of_digits();
sd.find_sum_of_digits();

}
void find_sum_of_digits()
{
int num=9876;
int rem2=0;
while(num>0)
{
int rem1=num%10;
rem2=rem2+rem1;
num=num/10;
}
System.out.println(rem2);
}
}
