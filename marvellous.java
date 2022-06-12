import java.lang.*;
class marvellous
{
  public static void main(String arg[])
{
   System.out.println("inside main");
demo obj=new demo();
obj.fun();
obj.gun();
System.out.println(obj.i);

demo objx=new demo(11,21);
objx.fun();
objx.gun();
System.out.println(objx.i);

}
}
class demo
{
public int i;
public int j;
 demo()
{
 this.i=0;
this.j=0;
}
demo(int x,int y)
{
 this.i=x;
this.j=y;
}
public void fun()
{
System.out.println("inside fun");
}

public void gun()
{
System.out.println("inside gun");

}
}