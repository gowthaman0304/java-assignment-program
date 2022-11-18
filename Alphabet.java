class Alphabet
{
public static void main(String[] args)
{
Alphabet ab =new  Alphabet();
ab.printD();
System.out.println();
ab.printE();
System.out.println();
ab.printF();
System.out.println();
ab.printI();
System.out.println();
ab.printT();
System.out.println();
ab.printJ();
System.out.println();
//ab.printH();
}
void printD()
{
for(int col=1;col<=7;col++)
{
System.out.print("* ");
}
System.out.println();
for(int row=1;row<=9;row++)
{
System.out.print("* ");
for(int i=1;i<=6;i++)
{
System.out.print("  ");
}
System.out.println("* ");
}
for(int col=1;col<=7;col++)
{
System.out.print("* ");
}
}
void printE()
{
for(int col=1;col<=7;col++){
System.out.print("* ");}
System.out.println();

for(int row=1;row<=9;row++){
if(row!=5)
System.out.println("* ");
else{
for(int col=1;col<=4;col++){
System.out.print("* ");}
System.out.println();
}
}

for(int col=1;col<=7;col++){
System.out.print("* ");}

}

void printF()
{
for(int col=1;col<=7;col++){
System.out.print("* ");}
System.out.println();

for(int row=1;row<=9;row++){
if(row!=5)
System.out.println("* ");
else{
for(int col=1;col<=4;col++){
System.out.print("* ");}
System.out.println();
}
}
}
void printI()
{
for(int col=1;col<=7;col++){
System.out.print("* ");}
System.out.println();
for(int row=1;row<=9;row++){
for(int i=1;i<=3;i++){
System.out.print("  ");
}
System.out.println("* ");
}
for(int col=1;col<=7;col++){
System.out.print("* ");}
}
void printT()
{
for(int col=1;col<=7;col++){
System.out.print("* ");}
System.out.println();
for(int row=1;row<=9;row++){
for(int i=1;i<=3;i++){
System.out.print("  ");
}
System.out.println("* ");
}
}
void printJ()
{
for(int col=1;col<=7;col++){
System.out.print("* ");}
System.out.println();
for(int row=1;row<=9;row++){
for(int i=1;i<=3;i++){
System.out.print("  ");
}
System.out.println("* ");
}
for(int col=1;col<=3;col++){
System.out.print("* ");}
}

}


