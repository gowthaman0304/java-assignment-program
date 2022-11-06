class Palindrome
{
public static void main(String[] args)
{
Palindrome pd =new Palindrome();
pd.find_palindrome();
}
void find_palindrome()
{ 
int num =2002;
int num2=num;
int rev=0;
while(num>0)
{
int rem=num%10;
rev=(rev*10)+rem;
num=num/10;
}
if(num2==rev){
System.out.println("palindrome");
}
else{
System.out.println("Not palindrome");
}
}
}

