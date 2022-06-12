import java.lang.*;
class inheritance1
{
static
{
  System.out.println("inside static block");
}
 public static void main(String agr[])
{
System.out.println("inside main");
Derived dobj=new Derived();
dobj.fun();
dobj.fun(11);
dobj.gun();
dobj.sun();
}
}
class base
{
 public int i;   //8b
 public int j;

public base()
{
 System .out.println("inside base constructor");
}

public void fun()
{
System.out.println("inside base fun");
}

public void fun(int x)
{
System.out.println("inside base fun with integer argument");
}

 public void gun()
{
 System.out.println("inside base gun");
}
}

class Derived extends base
{
 public int x;  //16byte
public int y;


public Derived()
{
System.out.println("inside derived constructor");
}

 public void sun()
{
System.out.println("inside derived sun");
}
}