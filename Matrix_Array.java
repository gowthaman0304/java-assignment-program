class Matrix_Array
{
public static void main(String[] args)
{
Matrix_Array ma =new Matrix_Array();
System.out.println("Matrix Multiplication");
ma.find_Multiplication();
System.out.println();
System.out.println("Matrix Adition");
ma.find_adition();

}
void find_Multiplication()
{
int a[][]={{4,5},{4,5}};
int b[][]={{4,5},{4,5}};
int c[][]=new int[2][2];

for(int row=0;row<2;row++)
{
for(int col=0;col<2;col++)
{
c[row][col]=a[row][col] * b[row][col] + a[row][col]*b[row][col];
System.out.print(c[row][col]+"   ");
}
System.out.println();
} 
}


void find_adition()
{
int a[][]={{4,5},{4,5}};
int b[][]={{4,5},{4,5}};
int c[][]=new int[2][2];

for(int row=0;row<2;row++)
{
for(int col=0;col<2;col++)
{
c[row][col]=a[row][col] + b[row][col];
System.out.print(c[row][col]+"   ");
}
System.out.println();
} 
}

}
