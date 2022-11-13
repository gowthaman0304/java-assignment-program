class Num_2_power_5
{
public static void main(String[] args)
{
Num_2_power_5 np =new Num_2_power_5();
np.find_2_power_5();
}
void find_2_power_5()
{
int power=5;
int base=2;
int result=1;
int num=1;
while(power>=1){
int power2=power;
while(power2>=1)
{
result=result*base;
power2=power2-1;
}
System.out.println("2 power"+" "+power+" "+"is"+" "+result);
power=power-1;
result=num;
}
}
}
