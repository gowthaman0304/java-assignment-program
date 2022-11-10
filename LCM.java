class LCM
{
public static void main(String[] args)
{
LCM lcm =new LCM();
lcm.find_least_common_multiple();
}
void find_least_common_multiple()
{
int no1=3;
int no2=100;
int big=no1>no2?no1:no2;
while(true)
{
if(big%no1==0 && big%no2==0)
{
System.out.println(big);
break;
}
big=big+1;
}
}

}
