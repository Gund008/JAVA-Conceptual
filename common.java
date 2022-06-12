import java.lang.*;
class common
{
 public static void main(String arg[])
{
   myclass obj=new myclass();
obj.calculate(3);
obj.calculate(4.0);
obj.calculate(5.0);

 myclass obj1=new myclass(11,21);
System.out.println(obj1.x);
System.out.println(obj1.y);
}
}
class myclass 
{
 public int x;
 public int y;
 public myclass(int a,int b)
{
 this.x=a;
 this.y=b;
}
public void calculate(int x)
{
  System.out.println("square="+(x*x));
}
public void calculate(float x)
{
  System.out.println("square="+(x*x));
}
public void calculate(double x)
{
  System.out.println("square="+(x*x));
}
}

  
 