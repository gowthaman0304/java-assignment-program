class Decimal
{
public static void main(String[] args)
{
Decimal dc =new Decimal();
dc.find_binary();
}
void find_binary()
{
int decimal=6;
String binary="";
while(decimal>0)
{
int rem=decimal%2;
binary=rem+binary;
decimal=decimal/2;
}
System.out.println(binary);

}
}
