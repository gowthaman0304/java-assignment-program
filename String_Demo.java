class String_Demo
{
public static void main(String[] args)
{
String_Demo sd =new String_Demo();
sd.charArrayToString();
sd.print_name();
System.out.println();
sd.count_of_vowels(); 
sd.print_only_char();
System.out.println();
sd.print_only_numbers();
System.out.println();
sd.print_only_spl_char();
}
void charArrayToString()
{
char data[]={'g','o','w','t','h','a','m'};
String str =new String(data);
System.out.println(data);
}

void print_name()
{
String name = "akash";

for(int i=0;i<name.length();i++)
{
System.out.print(name.charAt(i));
}
System.out.println();

for(int i=name.length()-1;i>=0;i--)
{
System.out.print(name.charAt(i));
} 
}
void count_of_vowels()
{
String name="mahasivam";
int count =0;
for(int i=0;i<name.length();i++)
{
if(name.charAt(i)=='a' ||
   name.charAt(i)=='e' ||
   name.charAt(i)=='i' ||
   name.charAt(i)=='o' ||
   name.charAt(i)=='u')
   count++;
}
System.out.println("Count of vowels"+" "+count);
}
void print_only_char()
{
String name = "mr.redhawk_10";
for(int i=0;i<name.length();i++)
{
if(name.charAt(i)>='a' && name.charAt(i)<='z')
System.out.print(name.charAt(i)+" ");
}
}

void print_only_numbers()
{
String name = "mr.redhawk_10";
for(int i=0;i<name.length();i++)
{
if(name.charAt(i)>='0' && name.charAt(i)<='9')
System.out.print(name.charAt(i)+" ");
}
}

void print_only_spl_char()
{
String name="mr.redhawk_10";
for(int i=0;i<name.length();i++)
{
if(name.charAt(i)>='0' && name.charAt(i)<='9')
{  }
else if(name.charAt(i)>='a' && name.charAt(i)<='z')
{  }
else
System.out.print(name.charAt(i)+" ");
}
}
}


