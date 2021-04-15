class MultiThread extends Thread
{
int n;
MultiThread(int n)
{
this.n=n;
}
public void run()
{ 
try
{
for(int i=1;i<=10;i++)
{
System.out.println(i+"*"+n+"="+(i*n));
Thread.sleep(5000);
}
}
catch(InterruptedException e)
{
}
}
public static void main(String []args)
{
MultiThread t1=new MultiThread(5);
t1.start();
}
}