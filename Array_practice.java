class Array_practice
{
public static void main(String[] args)
{
Array_practice ap =new Array_practice();

int[] ar={10,20,30,40,50};
for(int count=1;count<=2;count++)
{
ar=ap.shift_left_once(ar);
for(int i=0;i<ar.length;i++)
{
System.out.print(ar[i]+" ");
}
}
}

int[] shift_left_once(int[] ar)
{
System.out.println();
System.out.print("Before shifting: ");
for(int i=0;i<ar.length;i++)
{
System.out.print(ar[i]+" ");
}
System.out.println();
System.out.print("After shifting: ");
int i=0;
int temp=ar[0]; 
while(i<ar.length-1)
{
ar[i]=ar[i+1];
i++;
}
ar[i]=temp;
return ar;
}


}
