class Jungle_cat extends Cat
{
public static void main(String[] args)
{
Jungle_cat jc =new Jungle_cat();
jc.eat();
jc.sound();
jc.sleep();

}
void sound()
{
System.out.println("Meow Meow");
}

void eat()
{
System.out.println("Eating rat and fish");
super.eat();
}

void sleep()
{
System.out.println("8 hours sleeping");
//super.sleep();
}
}
