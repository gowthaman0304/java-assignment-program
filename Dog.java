class Dog extends Animals
{
public static void main(String[] args)
{
Dog dog =new Dog();
dog.eat();
dog.name= "Rocky";
dog.info();
//System.out.println(name);
}
void eat()
{
System.out.println("Dog eating pedigree");
//super.eat();
}
void info()
{
System.out.println("My dog name is" + " "+name);
}

}
