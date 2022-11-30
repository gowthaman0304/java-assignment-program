
class String_program
{
public static void main(String[] args)
{
String_program sp = new String_program();
sp.sum_numbers();
sp.palindrome();
sp.char_to_string();
sp.string_comparision();
sp.count_of_words();
sp.count_of_sentence();
}
void sum_numbers()
{
String name ="gowthaman12345";
int sum=0;
for(int i=0;i<name.length();i++)
{
if(name.charAt(i)>='0' && name.charAt(i)<='9')
{
char ch = name.charAt(i);
int no = Character.getNumericValue(ch);
    sum=sum+no;
	System.out.println(no);
}
}
System.out.println(sum);
}
void palindrome()
{
String name="amma";
String rev="";
for(int i=name.length()-1;i>=0;i--)
{
rev = rev+name.charAt(i);
} 
//System.out.println(rev);
if(name.equals(rev))
{
System.out.println("palindrome");
}
else
{
System.out.println("not palindrome");
}
}

void char_to_string()
{
char[] name ={'g','o','w','t','h','a','m'};
String s = new String(name);
System.out.println(s);
}
void string_comparision()
{
String name1 ="arunkumar";
String name2 ="gowtham";

System.out.println(name1.compareTo(name2));
}

void count_of_words()
{
String sent ="today going to college";
int count =0;
for(int i=0;i<sent.length();i++)
{
if(sent.charAt(i)==' ')
count++;
}
System.out.println("Total words in sentence is"+" "+(count+1));
}

void count_of_sentence()
{
String sent ="today going to college.to meet my friends.today hod meet to sign my record.we are going to play football.";
int count=0;
for(int i=0;i<sent.length();i++)
{
if(sent.charAt(i)=='.')
count++;
}
System.out.println(count);
}

}

