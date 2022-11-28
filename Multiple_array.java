import java.util.Scanner;

class Multiple_array
{
public static void main(String[] args)
{
Multiple_array ma =new Multiple_array();
ma.calculate_total();
}

void calculate_total()
{
int [][] marks = new int[3][5];
//System.out.println(marks.length);
Scanner sc =new Scanner(System.in);
int maths=0,highest=Integer.MIN_VALUE;

for(int row=0;row<3;row++)
{
int examtotal=0;

for(int col=0;col<5;col++)
{
System.out.println("Enter Marks");
marks[row][col]=sc.nextInt();
examtotal=examtotal+marks[row][col];
if(examtotal>highest)
highest=examtotal;
if(col==2)
maths=maths+marks[row][col];
}
System.out.println("Exam total is"+examtotal);
}

System.out.println("Avarege in maths is"+maths/3);
System.out.println("Highest Total is"+highest);
}

}
