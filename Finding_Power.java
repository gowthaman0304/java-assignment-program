class Finding_Power
{
public static void main(String[] args)
{
Finding_Power fp =new Finding_Power();
fp.find_power();
}
void find_power()
{
int no =4;
while(no>1){

int power=no;
int num=no;
while (power>1)
{
num=no* num;
power=power-1;
}
System.out.println(num);
no=no-1;
}
}
}


