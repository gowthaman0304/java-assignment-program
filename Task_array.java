class Task_array
{

public static void main(String[] args)
{
Task_array ta =new Task_array();

int[] ar={60,70,80,90};

for(int count=1;count<=2;count++)
{
ta.shift_right_once(ar);
for(int i=0;i<ar.length;i++)
{
System.out.print(ar[i]+" ");
}
System.out.println();
}
}
int[] shift_right_once(int[] ar)
{

int i=ar.length-1;
int temp = ar[ar.length-1];


while(i>0)
{
ar[i]=ar[i-1];
i--;
}
ar[i]=temp;
return ar;
}
}
