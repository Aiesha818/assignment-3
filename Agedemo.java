class AgeException extends Exception
{
private int age;
AgeException(int a)
{
this.age=age;
}
Public string to String()
{
System.out.println("Invalid age:"+age);
}
}
class Agedemo
{
public static void main(String a[])
{
try
{
int m=Integer.parseInt(a[0]);
if(a<18)
throw new AgeException(a);
System.out.println("valid age:"+a);
}catch(AgeException valid)
{
valid.display();
}
}
}
