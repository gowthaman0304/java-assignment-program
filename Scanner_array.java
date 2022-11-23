import java.util.Scanner;

class Scanner_array
{
public static void main(String[] args)
{
Scanner_array sa =new Scanner_array();
sa.marks();
}
void marks()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter no. of subjects");
int count=sc.nextInt();
int[] marks=new int[count];
int total=0;

for(int i=0;i<marks.length;i++)
{
System.out.print("Enter mark:");

marks[i] = sc.nextInt();
total=total+marks[i];
}
System.out.println(total);

for(int i=0;i<marks.length;i++)
{
System.out.print(marks[i]+" ");
}
}

}
