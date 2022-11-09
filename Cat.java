class Cat extends Animals
{
public static void main(String[] args)
{
Cat cat =new Cat();
cat.eat();
cat.sleep();
}
void eat()
{
System.out.println("Eating fish and milk");
super.eat();
}

void sleep()
{
System.out.println("16 hours sleeping");
}

}
