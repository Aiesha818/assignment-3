class T1 extends Thread
{
public void run()
{
for(int i=0;i<10;i++)
{
System.out.println("Thread 1");
try{
Thread.sleep(1000);
}
catch(InterruptedException e)
{
}
}
}
}
class R1 implements Runnable
{
public void run()
{
for(int i=0;i<10;i++)
{
System.out.println("Runnable R1");
}
try{
Thread.sleep(1000);
}
catch(InterruptedException e)
{
}
}
}
class TDemo4
{
public static void main(String a[])throws InterruptedException
{
T1 t1=new T1();
t1.start();
R1  R=new R1();
T2 t2=new T2(R);
t2.start();
}
}