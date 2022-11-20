import java.util.Scanner;

class Scanner_Demo
{
public static void main(String[] args)
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter price ");


int price=sc.nextInt();
int discount=(10*100)/100;
int offer_price=price-discount;
System.out.println("Rs."+offer_price +" "+"After 10% discount");


System.out.println("Enter Your Age");

int age =sc.nextInt();
if(age>=18)
System.out.println("Your Eligible to Vote");

else
System.out.println("Your Not Eligible to Vote");

}
}
