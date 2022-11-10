class Swapping
{
public static void main(String[] args)
{
Swapping swap =new Swapping();
swap.find_swapping();
swap.find_without_third_variable();
}
void find_swapping()
{
int no1=10;
int no2=20;
int temp = no1;

no1=no2;
no2=temp;
System.out.println(no1);
System.out.println(no2);
}
void find_without_third_variable()
{
int no1=1234;
int no2=1567;

no1=no1+no2;
no2=no1-no2;
no1=no1-no2;
System.out.println(no1);
System.out.println(no2);
}

}
