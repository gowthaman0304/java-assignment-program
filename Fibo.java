class Fibo
{
public static void main(String[] args)
{
Fibo fb = new Fibo();
fb.find_fibo();

}
void find_fibo()
{
int first=0;
int second=1;
int third=0;

while(first<100)
{
System.out.println(first);
third=first+second;
first=second;
second=third;
}

}

}
