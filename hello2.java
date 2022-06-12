import java.lang.*;
class hello2
{
public static void main(String arg[])
{
  System.out.println("inside main");
 addtion obj=new addtion();
obj.fun();
obj.gun();
obj.addtion();
obj.addtion(11,0);
obj.addtion(11,21,51);
 System.out.println(obj.a);
System.out.println(obj.b);
}
}
  class addtion
  {
   public int a;
   public int b;
 public int y;
public void addtion()
{
a=0;
b=0;
}
public void addtion(int i,int j)
{
 y=i+j;
return;
}
public void addtion(int i,int j,int k)
{
 y=i+j+k;
return;
}
public void fun()
{
 System.out.println("inside fun");
}
public void  gun()
{
 System.out.println("inside gun");
}
}
