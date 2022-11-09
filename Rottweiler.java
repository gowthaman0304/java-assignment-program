class Rottweiler extends Dog
{
public static void main(String[] args)
{
Rottweiler rw =new Rottweiler();
rw.eat();
//System.out.println(name);
rw.name="Blacky";
rw.info();

}
void info()
{
System.out.println("My rottweiler name is"+" "+name);

}

void eat()
{
System.out.println("Eating meat");
super.eat();
}
}
