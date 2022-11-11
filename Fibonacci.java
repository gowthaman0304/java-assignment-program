class Fibonacci
{
public static void main(String[] args)
{
Fibonacci fb=new Fibonacci();
fb.find_fibo_without_third_variable();
}
void find_fibo_without_third_variable()
{
int first=0;
int second=1;


while(first<100)
{
System.out.println(first); //1

first=second-first; 
second=first+second;

}

}
}
