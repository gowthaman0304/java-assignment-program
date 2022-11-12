class Test
{
public static void main(String[] args)
{
Test test =new Test();

test.without_fourth_variable();
test.without_five_variable();
}
void without_fourth_variable()
{
int a=5;
int b=6;
int c=7;

c=a+b+c;
b=c-(a+b);
a=c-(a+b);
c=c-(a+b);

System.out.println(a);
System.out.println(b);
System.out.println(c);

}
void without_five_variable()
{
int a=5;
int b=6;
int c=7;
int d=8;

d=a+b+c+d;
c=d-(a+b+c);
b=d-(a+b+c);
a=d-(a+b+c);
d=d-(a+b+c);
System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);
}
}
